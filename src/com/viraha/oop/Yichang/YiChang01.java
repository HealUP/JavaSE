package com.viraha.oop.Yichang;

public class YiChang01 {
    public void a(){
    b();

}
    public void b(){
        a();
    }
    public static void main(String[] args) {
        int a=1,b=0;

//        newһ�������ڲ���
        try {
          new YiChang01().a();
        } catch (Error e ) {
            System.out.println("�������Error�쳣");
        }  catch (Exception e ) {
            System.out.println("�������Exception�쳣");
        }catch (Throwable t ) {
            System.out.println("�������Throwable�쳣");
        } finally {
            System.out.println("ִ��");
        }
    }
    }
//catch ��С����




