package һ�����Ƿ��ڶ��������;

import java.util.ArrayList;
import java.util.List;

public class Solution {  
	  
    private Solution() {  
    }  
  
    public static class Point {  
        double x;  
        double y;  
        
        public Point(double x,double y) {
        	this.x = x;
        	this.y = y;
        }
    }  
  
    /** 
     * ����һ�����Ƿ���һ������������� 
     * 
     * @param mPoints �����������б� 
     * @param point   ���жϵ� 
     * @return true ����ΰ��������,false �����δ��������㡣 
     */  
    public static boolean isPolygonContainsPoint(List<Point> mPoints, Point point) {  
        int nCross = 0;  
        for (int i = 0; i < mPoints.size(); i++) {  
            Point p1 = mPoints.get(i);  
            Point p2 = mPoints.get((i + 1) % mPoints.size());  
            // ȡ���������һ����,����point��ˮƽ�ӳ���,����뵱ǰ�ߵĽ������  
            // p1p2��ˮƽ�߶�,Ҫôû�н���,Ҫô�����޸�����  
            if (p1.y == p2.y)  
                continue;  
            // point ��p1p2 �ײ� --> �޽���  
            if (point.y < Math.min(p1.y, p2.y))  
                continue;  
            // point ��p1p2 ���� --> �޽���  
            if (point.y >= Math.max(p1.y, p2.y))  
                continue;  
            // ��� point��ˮƽ���뵱ǰp1p2�ߵĽ���� X ����  
            double x = (point.y - p1.y) * (p2.x - p1.x) / (p2.y - p1.y) + p1.x;  
            if (x > point.x) // ��x=point.xʱ,˵��point��p1p2�߶���  
                nCross++; // ֻͳ�Ƶ��߽���  
        }  
        // ���߽���Ϊż�������ڶ����֮�� ---  
        return (nCross % 2 == 1);  
    }  
  
    /** 
     * ����һ�����Ƿ���һ������α߽��� 
     * 
     * @param mPoints �����������б� 
     * @param point   ���жϵ� 
     * @return true ���ڶ���α���,false �㲻�ڶ���α��ϡ� 
     */  
    public static boolean isPointInPolygonBoundary(List<Point> mPoints, Point point) {  
        for (int i = 0; i < mPoints.size(); i++) {  
            Point p1 = mPoints.get(i);  
            Point p2 = mPoints.get((i + 1) % mPoints.size());  
            // ȡ���������һ����,����point��ˮƽ�ӳ���,����뵱ǰ�ߵĽ������  
  
            // point ��p1p2 �ײ� --> �޽���  
            if (point.y < Math.min(p1.y, p2.y))  
                continue;  
            // point ��p1p2 ���� --> �޽���  
            if (point.y > Math.max(p1.y, p2.y))  
                continue;  
  
            // p1p2��ˮƽ�߶�,Ҫôû�н���,Ҫô�����޸�����  
            if (p1.y == p2.y) {  
                double minX = Math.min(p1.x, p2.x);  
                double maxX = Math.max(p1.x, p2.x);  
                // point��ˮƽ�߶�p1p2��,ֱ��return true  
                if ((point.y == p1.y) && (point.x >= minX && point.x <= maxX)) {  
                    return true;  
                }  
            } else { // ��⽻��  
                double x = (point.y - p1.y) * (p2.x - p1.x) / (p2.y - p1.y) + p1.x;  
                if (x == point.x) // ��x=point.xʱ,˵��point��p1p2�߶���  
                    return true;  
            }  
        }  
        return false;  
    }  
    
    
    
    public static void main(String[] args) {
		
    	//�����β���
    	
    	Point point1 = new Point(0,0);
    	Point point2 = new Point(10,10);
    	Point point3 = new Point(0,20);
    	Point point4 = new Point(10,-10);
    	List<Point> list = new ArrayList<Point>();
    	list.add(point1);
    	list.add(point2);
    	list.add(point3);
    	list.add(point4);
    	
    	Point test = new Point(10,0);
    	
    	System.out.println(isPolygonContainsPoint(list,test));
        
    	
    	
	}
  
}  