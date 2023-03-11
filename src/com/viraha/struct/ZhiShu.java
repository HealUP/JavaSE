package com.viraha.struct;

public class ZhiShu {
    public static void main(String[] args) {
//不建议使用
       outer: for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i / 2; j++) {
                //i/2:比一半就行了  i除以j 除到一半就行了  取余
                if (i%j==0){
                    continue outer;//满足i%j==0，就从从头再来
            }

        }
           System.out.print(i+" ");
    }
}

}