<span id"top"></span>

[TOC]

# Day_02-基础

## 1、标识符、注释
### 1.注释的几种写法
* 单行注释 `//`
* 多行注释 `/*  */`
* 文档注释(java独有)：可以通过javadoc将注释转化成html文档，格式：
```
/**
@author
@version
 */
```

* 注：写代码需要注意的
	* 前提：思路和思维练顺
	* 避免在思维没有成熟的情况下就写代码：想好了再做，想清楚了再说，谋定后动（避免不断返工，乱），按照标准思路来，想清楚思路，写代码就是往里填东西，不要着急。（就像吃饭一样，不要着急跟别人抢似的，就慢慢吃）

### 2.按照步骤写代码的流程
> 需求：写一个HelloWorld程序，并将HelloWorld字样显示在屏幕上

>  思路：
>  1.找个编辑器
>  2.用Java语言写个程序
>  3.程序需要运行，并且可以显示

>  步骤：
>  1.定义一个类：通过class实现
>  2.让这个类运行：需要主方法
>  3.显示功能：通过输出语句实现

>  写代码：

>  测试：
>  1.javac 检查语法错误
>  2.java 进行运行运算

**以下是案例**
```
//1.用class定义类
class Demo{
    //2.类中定义主方法
    public static void main(String[] args){
          //3.主方法定义输出语句
          System.out.println("Hello World!");
    }
}
```

## 2、关键字、变量
### 1.用关键字定义变量
```
class VarDemo
{
    public static void main(String[] args)
    {
        //数据类型 变量名 = 初始化值；
        byte b = 3;//一两的碗装四两袋子的米，但是袋子里只有一两，编译器检查，6在byte范围内，可以自动转型，默认int，四个八位
        short s = 4;
        int i = 7;

        /*long l = 12345678900;出现过大的整数，因为右面的数值已经超出了int的范围，
        但是没有超出long的范围，想要把这个整数存到long中，就需要将其从int转换成为long
        需要在结尾处添加一个l*/
        long l = 12345678900l;

        float f = 2.3f;//小数后面加f可以表示单精度存储，而2.3默认的是double类型

        double d = 3.4;

        char c = '1';

        boolean bo = true;//bo = false;
    }
}
```

### 2.自动类型提升、强转
```
class VarDemo2
{
    public static void main(String[] args)
    {
        /*
        byte b = 4;//java中，不同类型的数据是不能进行运算的，但是byte和int却可以运算，因为只要都是数值型，就都可以运算，其中将byte自动类型提升（小向大提升），变成了int型
        int x = 3;
        x = x + b;
        System.out.println("x="+x);
        */

        /*编译只做语法检查，运行时期才进行运算
        byte b = 3;//可以自动类型提升，因为等号右面是常量
        b = b + 1;//需要byte，却给了一个int，不可以自动类型提升，因为等号右面有变量，开启了java的自动保护机制，以防b+1超出byte的范围(b=127)，所以报错提前预警，不能自动转换
        */
        
        /*强转
        byte b = 3;
        b = (byte)(b + 1);
        System.out.println("b="+b);
        */

        //因为有编码表，计算机能识别各个国家的文字
        char ch = 97;
        System.out.println("ch="+ch);

        char ch1 = 'a';
        System.out.println("ch1="+(ch1+1));//强制转换，从二字节变成四字节

        char ch2 = 'a';
        System.out.println("ch2="+(char)(ch2+1));
    }
}
```

### 3.运算符

```
class OperateDemo
{
    public static void main(String[] args)
    {
        int x = 2810;
        System.out.println(x/1000);//注意是整除，小数点后面的数被自动省去了
        System.out.println(5%2);//结果为1
        System.out.println(2%5);//结果为2
        System.out.println(-2%5);//负数运算结果只参照左面，左面为负就是负，本条结果为-2
        System.out.println(2%-5); //本条结果为2
        //1.任何数模2，结果非0即1，模拟开关算法的切换
        //2.任何数模（算法：将一个数控制在3以内，就%3）


        /*
        ++：自增，对原有数据+1
        当自增运算是独立语句时，a++与a--没有区别
        当自增运算与其他结合时，有区别：
        b = a++:将原始的a赋值给b
        b = ++a:将自增后的a赋值给b(常用)
        */

        int a = 3 ,b;
        b = ++a;
        System.out.println("a="+a+" b="+b);

        int c = 3, d;
        d = c++;
        System.out.println("c="+c+" d="+d);
        System.out.println("5"+5);        
        System.out.println("5+5="+(5+5));
        System.out.println("5+5="+5+5);
    }
}
```


```
class OperateDemo2
{
    public static void main(String[] args)
    {
        /*
        赋值运算符：特殊功能，可以做自动转换 s = 4
        = += -= *= /= %=
        */
        short s = 4;
        //s = s + 5;//运行不通过，因为等号右面是变量，开启了防超范围的自我保护
        s+=5;//运行通过，因为他是赋值运算符，可以自动转换，s是short类型，而4是int类型，可以自动转换，不涉及丢失精度（常用） 

        /*
        比较运算符的运算结果，要么是true，要么是false
        */
        System.out.println(3==4);
        System.out.println(3!=4);

        /*逻辑运算符：用来连接boolean型表达式*/
        int x = 3;
        System.out.println(x>2 & x<5);
        System.out.println(x>2 | x<5);
        System.out.println(x>2 ^ x<5);
        //短路与&& 短路或||

        int y = 1;
        y>3 & y<6//(左假右真，结果为假，右面参加运算时使用，两面都参与运算)
        y>3 && y<6//(左假，结果为假，右面不看，运算效率高，左面假就不考虑右面)（常用）
        /*
        &：两面都参与运算
        &&：左面为false，右面不参与运算
        |：两面都参与运算
        ||：左面为true，右面不参与运算
        */
    }
}
```

***



































