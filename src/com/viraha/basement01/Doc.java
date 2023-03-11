package com.viraha.basement01;
/**
 * @author 不秃头的fofo
 * @version 1.0
 * @since 1.8
 */


public class Doc {
  //属性
    String name;//实例变量
  //方法

  /**
   *
   * @param name
   * @return
   * @throws Exception
   */
  public String test(String name)throws Exception{
      return name;
    }
}
//通过命令行来生成java文档javadoc -encoding UTF-8 -charset UTF-8 Doc.java(javadoc 参数 java文件)
//作业：使用idea生成Javadoc文档！！
//第一步 点击tools  找到 Generate javadoc