package com.viraha.others;

public class student{

    //属性
    private double sNo;
    private String sName;
    private String sSex;
    private int sAge;
    private double sJava;
    //构造方法
    public student(double sNo,String sName,String sSex,int sAge,double sJava) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }
//get set 添加 alt+insert
    public double getsNo() {
        return sNo;
    }

    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public  double getsJava(){
        return sJava;
    }
    public void setsNo(double sNo) {
        this.sNo = sNo;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public void setsJava(double sJava) {
        this.sJava = sJava;
    }


    public static void main(String[] args) {
        student s1 = new student(1,"孙","男",20,100);
        student s2 = new student(2,"李","男",20,90);
        student s3 = new student(3,"盘","女",19,85);
        student s4 = new student(23,"邱","男",22,100);
        student s5 = new student(13,"邓","男",20,80);
        double avg =(s1.sJava+s2.sJava+s3.sJava+ s4.sJava+ s5.sJava)/5.0;
        System.out.println(avg);

    }
    }

