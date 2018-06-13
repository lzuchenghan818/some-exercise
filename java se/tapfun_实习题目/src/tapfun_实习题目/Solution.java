package tapfun_实习题目;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
 
/**
 *
 * @author xxx
 * 统计词频
 */
 
public class WordCount  extends RecursiveTask<Map<String,Integer>>{
    private String path;
    public WordCount (String path){
        this.path = path;
    }
 
    @Override
    protected Map<String, Integer> compute() {
        String text = readTextFromFile(path);//读取文档内容，返回一个字符串
        Map<String,Integer> map = statisticWord(text);//将字符串分词，统计词频
        return map;
    }
 
    /**
     *
     * @param path
     * @return String 字符串
     */
    public static String readTextFromFile(String path) {
    
       String result = "";
       FileReader fr ;
       BufferedReader br;
		try {
		      fr = new FileReader(path);
		      br = new BufferedReader(fr);
		      String line = null;
              while((line=br.readLine())!=null){
                result+=line;
              }
             fr.close();
		     br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
       return result;
    	
    }
    /**
     * 统计一条字符串词频
     * @param text
     * @return
     */
    public static Map<String,Integer> statisticWord(String text){
        
       HashMap<String,Integer> map = new HashMap<String,Integer>();
       
       String words[] = text.split(" ");
       
       for(String word:words){
       
            if(map.containsKey(word)){
            	int number = map.get(word);
                map.put(word, ++number);
            }else{
            	map.put(word,1);
            }
       }
       return map;
    }
    /**
     * 合并每个文档词频统计结果
     * @param maps
     * @return map
     */
    public static Map<String,Integer> merge(Map<String,Integer>[] maps){
    
         Map<String,Integer> result = new HashMap<String,Integer>();
         
         for(int i=0;i<maps.length;i++){
           
               Set<String> keys = maps[i].keySet();
               for(String word:keys){
                  if(result.containsKey(word)){
                      int number = result.get(word);
                      result.put(word, ++number);
                  }else{
                    result.put(word, 1);
                  }
               }
           }
        return result;
    }
 
    public static void main(String[] args) {
        String dir = "docs";
        WordCount  test = new WordCount (dir);
        
        File file = new File(dir);
        File[] files = file.listFiles();
        Map[] list = new Maps[files.length];
        
        //统计相对路径docs目录下文本里面单词的词频    
        //请实现(4)......注：
    }
}