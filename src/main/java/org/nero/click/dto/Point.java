package org.nero.click.dto;

/**
 * Author nero
 * Date   2016/10/16 0016
 * Time   18:54
 * Email  nerosoft@outlook.com
 */
public class Point{
    private double x;
    private double y;
    private String sampleID;

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getSampleID() {
        return sampleID;
    }

    public void setSampleID(String sampleID) {
        this.sampleID = sampleID;
    }

    @Override
    public String toString() {
        return "["+x+","+y+",'"+sampleID+"']";
    }

//    public int compareTo(Object o) {
//        if(o instanceof Point){
//            Point p = (Point)o;
//            if((this.x == p.x)&&
//                    (this.y ==p.y)&&
//                    (this.sampleID.equals(p.sampleID))){
//                return 0;
//            }
//            return 1;
//        }
//        return 1;
//    }
}
