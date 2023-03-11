package com.viraha.oop.Yichang;
//catch 假设捕获多个异常 从小到达 从小大到大捕获异常
public class Test {
    public static void main(String[] args) {
        int a=1;
        int b=0;



        try {
            //            监控区域
            new Test().a();
            new Test().b();
       }catch (ArithmeticException e ){
//           捕获异常   想要捕获的最高类型
            System.out.println("b不能为0");
        }
      catch (Exception c){

      }

        catch (Throwable t){

        }
        finally {
//            处理善后工作
            System.out.println("finally!");
//            finally 可以不要
        }

    }

    //               写一个a,b方法


    public void a(){
        b();

    }
    public void b(){
        a();
    }
}
