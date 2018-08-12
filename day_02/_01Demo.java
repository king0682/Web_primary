/**
java中除了单行注释//和多行注释/* * /以外的独有的注释方法，文档注释，可以通过javadoc转化成html文档
@author
@version
 */

 /*
 避免在思维没有成熟的情况下就写代码：想好了再做，想清楚了再说，谋定后动（避免不断返工，乱），按照标准思路来，想清楚思路，写代码就是往里填东西，不要着急，前提：思路练顺

 需求：写一个HelloWorld程序，并将HelloWorld字样显示在屏幕上

 思路：
 1.找个编辑器
 2.用Java语言写个程序
 3.程序需要运行，并且可以显示

 步骤：
 1.定义一个类：通过class实现
 2.让这个类运行：需要主方法
 3.显示功能：通过输出语句实现

 写代码：

 测试：javac java
  */

  //1.用class定义类
class Demo{
    //2.类中定义主方法
    public static void main(String[] args){
          //3.主方法定义输出语句
          System.out.println("Hello World!");
    }
}