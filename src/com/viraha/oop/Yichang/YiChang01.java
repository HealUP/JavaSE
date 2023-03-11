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

//        new一个匿名内部类
        try {
          new YiChang01().a();
        } catch (Error e ) {
            System.out.println("程序出现Error异常");
        }  catch (Exception e ) {
            System.out.println("程序出现Exception异常");
        }catch (Throwable t ) {
            System.out.println("程序出现Throwable异常");
        } finally {
            System.out.println("执行");
        }
    }
    }
//catch 从小到大




