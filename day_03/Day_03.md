<span id"top"> </span>


[TOC]

# Day_03

## 1、运算符
### 1.左移、右移、与、或、异或、取反  

```
class OperateDemo4
{
    public static void main(String[] args)
    {
        //<<左移两位乘2^2，左移几位就是几次幂，作用：只方便关于2的倍数的乘法，运算速度快。
        System.out.println(6<<2);

        //>>右移除几个2，右移是整数，原最高位是什么，最高位补什么(负数最高位补1，正数最高位补0)

        /*>>>无符号右移，无论原最高位是1或者是0，最高位都补0，
        用法：当需要将一串数字取八进制/十六进制时，每右移三位一取，最后结果就是八进制，最高位一直补充0*/

        //无符号右移：遇到2的次幂的乘除运算，先想到位移，想操作一段二进制位，用无符号右移

        //与：用来取二进制数中想要的数，获取有效的1(想取后三位，就与00000111)，如果想取00101011中的101的话，则用>>>向右移动三位

        //异或：一个数异或两次另一个数时，结果还是本身，6^3^3=6(音乐加密：每个字节都异或3一次，解密：再异或3一次)

        //取反：-6 = ~6+1  0110 ~ 1001(-7)[减1取反是0111，结果为7，那么原来的数是-7]
    }
}
```
### 2.三元运算符

```
class OperateDemo5
{
    public static void main(String[] args)
    {
        //三元运算符
        int x = 2,y;
        y = x>1?100:200;

        System.out.println("y="+y);

        //需求：有a,b,c三个不确定的数，想知道最大的是哪个？
        int a=4,b=80,c=20,z;
        z = a>b?a:b;
        z = c>z?c:z;
        System.out.println("max="+z);
    }
}
```

### 3.运算符小练习

```
class OperateTest
{
    public static void main(String[] args)
    {
        //练习：在不借助第三方变量的情况下，交换两个整数变量
        int a = 3, b = 7;

        /*通过第三方变量进行置换
        int temp = a;
        a = b;
        b = temp;
        */

        /*通过和的形式：两个数据较大，可能会超出范围
        a = a + b;
        b = a - b;
        a = a - b;
        */

        /*用异或(很重要)：进行位运算就不需要担心超出范围的事情
        7^3^3=7 ; 7^3^7=3*/
        a = a ^ b;// a = 3 ^ 7;
        b = a ^ b;// b = 3 ^ 7 ^ 7 = 3;
        a = a ^ b;// a = 3 ^ 7 ^ 3 = 7;
        
        System.out.println("a="+a+" b="+b);
    }
}
```
[>>>top<<<](#top)
***

## 2、流程控制if
### 1.格式一
```
int x = 3;
if(x > 1)
{
    System.out.println("yes");
}
System.out.println("over");
```
### 2.格式二
```
if(条件表达式)
{
    执行语句一；
}
else
{
    执行语句二；
}
```
**代码：**
```
int b=1,c;
if(b > 1)
{
    c = 100;
}
else
{
    c = 200;
}
System.out.println(c);
```
* **注意：if else与三元运算符的区别**
	* 三元运算符 可以理解是 if else 的缩写。但并不是所有if else都能缩写成三元，因为三元运算符运算完必须有一个结果，但是if else可以输出一个语句，而不是结果（记住：凡是简化都是有弊端的）
	* 条件：当if else运算完有结果的时候，就可以转化成为三元运算符

### 3.格式三

```
标准语句：
if(条件表达式1)
{
    执行语句1：
}
else if（条件表达式2）
{
    执行语句2：
}
else
{
    执行语句3：
}
```
* 注意：
	* if else中可以嵌套if
	* if的大括号可以省略，但是省略大括号的if只能带一条语句，否则就会出错  

**代码**

```
int i = 11;

if(i < 1)
{
    System.out.println("a");
}
else if(i >= 1 && i < 3)
{
    System.out.println("b");
}
else if(i >= 3 && i < 8)
{
    System.out.println("c");
}
else
{
    System.out.println("d");
}
```
**以下是特殊例子**
```
class IfDemo02
{
	public static void main(String[] args)
	{
		int i = 3;
		if(i > 1)
		{
			System.out.println("a");
		}
		else if(i > 2)
		{
			System.out.println("b");
		}
		else if(i > 3)
		{
			System.out.println("c");
		}
		else
		{
			System.out.println("d");
		}
	}
}
//else if在一行，并且有if，最终可以跟着else
//最终结果为a
```
### 3.格式三
```
class IfDemo03
{
	public static void main(String[] args)
	{
		int i = 3;
		if(i > 1)
		{
			System.out.print("a");
		}
		if(i > 2)
		{
			System.out.println("b");
		}
		if(i > 3)
		{
			System.out.println("c");
		}
		else
		{
			System.out.println("d");
		}
	}
}
//结果会打印abd
```
### 4.if小练习 -- 输入数字，返回星期

```
1.需求：根据用户给定的数值，展示该数值对应的星期。如：2，星期二。
2.思路/疑问：
    1.如何获取数值？
    答案：因为数据来源很多，所以将数据统一看成一个变量，以点概面
     ，用变量代表对所有数据进行操作

    2.数值很多，如果输入一个数值就能对应一个星期？
    答案：进行数值判断，转化成星期

    3.如何显示？
    答案：用输出语句显示

3.步骤/解决方案
    1.定义变量来记录数据
    2.用if语句进行判断（第三种判断语句）
    3.不同条件对应不同输出语句
```

**代码**
```
class IfTest
{
    public static void main(String[] args)
    {

        //执行了一句之后，剩下的语句执行没有意义，所以不用简单if-else结构，使用多条件一个结果 if-else语句
        //  1.定义变量来记录数据
        int week = 2;
        
        //  2.用if语句进行判断（第三种判断语句）
        if(week == 1)
        //  3.不同条件对应不同输出语句
            System.out.println(week+"对应的是星期一");
        else if(week == 2)
            System.out.println(week+"对应的是星期二");
        else if(week == 3)
            System.out.println(week+"对应的是星期三");
        else if(week == 4)
            System.out.println(week+"对应的是星期四");
        else if(week == 5)
            System.out.println(week+"对应的是星期五");
        else if(week == 6)
            System.out.println(week+"对应的是星期六");
        else if(week == 7)
            System.out.println(week+"对应的是星期日");
        else
            System.out.println(week+"没有对应的星期"); 
    }
}
```
[>>>top<<<](#top)
***

## 3、流程控制switch
### 1.switch语句格式  

```
switch(表达式)  //注意不是条件表达式
{
    case 取值1:
        执行语句;
        break;

    case 取值2:
        执行语句;
        break;
    ....
    default:
        执行语句;
        break;                            
}
```
**需要注意的几点**
* case:后面可以添加多条语句，冒号代表继续，分号代表结束
* switch的位置摆放没有顺序，default可以放在上面。但是执行顺序却有顺序，按照摆放顺序执行，最后执行default


### 2.switch语句特点
> 1.答案的书写没有顺序，但是执行却有顺序
> 2.匹配的答案被执行，一直执行到break或者switch末尾括号（最后一个case也是没有break）才结束
> 3.switch语句能判断变量的范围：byte,short,int,char,enum(5.0),String(7.0)

### 3.switch的几种使用格式
#### 第一种 -- 标准的

```
int x = 2;
switch(x){
    //1.定义答案
    case 5:
        System.out.println("a");
        break;
    case 3:
        System.out.println("b");
        break;
    default:
        System.out.println("c");
        break;
}
System.out.println("Hello World!");
```

#### 第二种 -- default上提，case5没有break

```
switch(x){
    //1.定义答案
    case 5:
        System.out.println("a");
        //break;

    default:
        System.out.println("c");
        break;                

    case 3:
        System.out.println("b");
        break;
}
```
* **注意**：这里default的顺序仍然是最后，但是如果x=5的话，default算是case5的一部分


#### 第三种 -- default上提，case5和default都没有break


```
int x = 2;
switch(x){
    //1.定义答案
    case 5:
        System.out.println("a");
        //break;

    default:
        System.out.println("c");
        //break;                

    case 3:
        System.out.println("b");
        break;
}
```
* **注意**：该种情况的结果是cb，因为一直遇到break才结束  

[>>>top<<<](#top)

***

## 4、流程控制while
### 1.适用条件
* 什么时候用？当对某些语句需要执行很多次的时候使用
* 注意：while()后面没有** : 和 ; **，否则就会出现不断提问，有死循环--while(x<3);没有循环体，一直在问x<3?

### 2.代码格式
```
int x = 1;
while(x<3)
{
    System.out.println("x="+x);
    ++x;
}

System.out.println("finish!");
```

### 3.实例应用
#### 需求1：显示从1-10
```
int x = 1;
while(x<11)
{
    System.out.println(x);
    x++;
}
```
#### 需求2：运算1-100的加和
     思路：
        1.每次重复的部分：和 + 下一个数，需要循环
        2.和确定么？不，需要变量
        3.下一个数确定么？不，需要变量，而且下一个数自增
     步骤：
        1.定义变量，一个记录和，一个记录下一个数
        2.需要循环
        3.循环内容：1.和+下一个数 2.自增

```
//1.定义变量，一个记录和，一个记录下一个数
    int x = 1, sum = 0;
//2.需要循环
    while(x<=100)
    {
//3.循环内容：1.和+下一个数 2.自增
        sum = sum + x;
        x++;
    }
System.out.println("sum="+sum);
```

[>>>top<<<](#top)

***

## 5、流程控制dowhile（用的不多）
### 1.格式
```
do
{
    执行语句;
}
while(条件表达式);
```

### 2.while与do while的区别
* while:条件不满足就不运行
* do while:条件无论满足与否，至少运行一次

### 3.while与do while的区别（代码实例）
**while**
```
int x = 3;
while(x < 3)
{
    System.out.println("x="+x);
    x++;
}

System.out.println("while循环结束了！");
```

**do while**
```
int y = 3;
do
{
    System.out.println("y="+y);
    y++;
}
while(y<3);
```

[>>>top<<<](#top)

***

## 6、流程控制for
### 1.简单的for循环
#### 1.格式
```
for(初始化表达式(1次)；循环条件表达式；循环后的操作表达式)
{
    执行语句：（循环体）
}
```

#### 2.格式代码
```
//其中x是局部变量，出了for这个循环就不好使了
for(int x = 1; x<3; x++)
{
    System.out.println("x="+x);
}
```

#### 3.for和while的区别
```
int y = 1;
while(y<3)
{
    System.out.println("y="+y);
    y++;
}
//这个y是全局变量，能够作用于整个main函数
```

#### 4.最简单的死循环
1.`while(true){}`
2.`for(; ;){}`--for循环不写条件表达式，默认为真
**注：**这两个不能同时用，否则会造成unreachable code

#### 5.实战案例
    需求：获取1-100之间6的倍数的个数

    思路：
    1.符合条件的个数未知？定义变量
    2.6的倍数怎么表示？整除6没有余数
    3.需要对1-100每个数都进行判断？使用循环，对记录个数的变量自增


    步骤：
    1.定义变量a，记录个数：记录1-100变化的数
    2.定义循环：遍历1-100，对1-100判断
    3.满足条件，个数变量b自增

```
//1.定义变量a，记录个数
int count = 0;
for(int x = 1; x<100 ; x++ )
{
    if(x % 6 == 0)
        count++;
}
```

### 2.for循环的嵌套
#### 1.代码格式
```
//打印三遍y=0/1/2/3
for(int x=0; x<3; x++)
{   
    for(int y=0; y<4; y++)
    {
        System.out.println("y="+y);
    }
}
```

```
//打印12行*
for(int x=0; x<3; x++)
{   
    for(int y=0; y<4; y++)
    {
        System.out.println("*");
    }
}
```

```
//打印一个3*4的矩形
for(int x=0; x<3; x++)//控制行
{   
    for(int y=0; y<4; y++)//控制列/每一行的个数
    {
        System.out.print("*");
    }
    System.out.println();//只是换行作用
}
```

#### 2.实战案例
```
需求：在屏幕上显示以下图形。
*****
****
***
**
*

思路：
1.5行组成，多行：循环搞定，外循环
2.每行多个星：循环内还需要循环，负责每行内有多少个星，内循环
总结：外面有n多变化，每个变化内又有n多变化，不假思索写for嵌套结构

步骤
1.for嵌套循环
```
**以下几种写法均可以达到目的，但思路并不相同，通过刚开始的“笨"方法过渡到“优化方法”**
```
//01.控制内循环结束值
int z = 5;
for(int x=1; x<=5 ; x++)
{
    for(int y=1; y<=z ; y++)
    {
        System.out.print("*");
    }
    z--;
    System.out.println();
}
```

```
//02.控制内循环起始值，与上面方法同理
int a=1;
for(int i=1 ; i<=5 ; i++ )
{
    for(int j=a ; j<=5 ; j++ )
    {
        System.out.print("@");
    }
    a++;
    System.out.println();
}

```

```
//03.下三角最简化的1
for(int i=1 ; i<=5 ; i++ )
{
    for(int j=i ; j<=5 ; j++ )
    {
        System.out.print("&");
    }
    System.out.println();
}
```

```
//04.下三角最简化的2
for(int i=5 ; i>=1 ; i-- )
{
    for(int j=i ; j>=1 ; j-- )
    {
        System.out.print("O");
    }
    System.out.println();
}
```

```
//05.正三角
for(int i=1 ; i<=5 ; i++ )
{
    for(int j=1 ; j<=i ; j++ )
    {
        System.out.print("B");
    }
    System.out.println();
}

```


[>>>top<<<](#top)

***

## 7、break
### 1.break使用范围：switch判断，循环(for,while系列)
注意：break,continue单独作用的时候，下面不要定义语句，因为执行不到
### 2.break使用的几种情况
#### for循环
情况一：
```
for(int x=0; x<3 ;x++ )
{
    System.out.println("x="+x);
    break;
}
```

情况二：for中含if判断
```
for(int x=0; x<3 ;x++ )
{
    if(x==1)
        break;//这个break控制的是for循环
    System.out.println("x="+x);
}
```
情况三：for是双层嵌套
```
for(int x=0; x<3 ;x++ )
{
    for(int y=0; y<4 ;y++ )
    {
        System.out.println("x="+x);
        break;//这个break只跳内层循环
    }
}
```
* 工作流程：

```
1.x=0,y=0,输出x=0,跳上一层,x++
2.x=1,y=0,输出x=1,跳上一层,x++
3.x=2,y=0,输出x=2,跳上一层,x++
4.x=3,不符合x<3，跳出
```
情况四：跳出for的外层村换
```
outer:for(int x=0; x<3 ;x++ )
{
    inner:for(int y=0; y<4 ;y++ )
    {
        System.out.println("x="+x);
        break outer;
    }
}
```
[>>>top<<<](#top)

***

## 8、continue
### 1.continue作用范围
只作用于循环(for,while)

### 2.continue的作用
结束本次循环，开始下次循环

注意：break,continue单独作用的时候，下面不要定义语句，因为执行不到

* 结束循环


```
for(int x=0; x<10 ;x++)
{
    if(x%2==0)
        continue;
    System.out.println("x="+x);
}
```

* 结束外循环


```
outer:for(int x=0; x<3 ;x++ )
{
    inner:for(int y=0; y<4 ;y++ )
    {
        System.out.println("x="+x);
        continue outer;
    }
}
```

[>>>top<<<](#top)

***

## 9、本单元实战

### 1.案例一 —— 根据用户给定的月份，指出该月份属于哪个季节

```
需求1：根据用户给定的月份数据，指出该月份属于哪个季节
3,4,5   春季
6,7,8   夏季
9,10,11 秋季
12,1,2  冬季

思路：
1.接受用户输入数据，定义变量x
2.判断x属于哪几个月份，用if判断，并且输出回答
3.对于没有月份的选项，other

步骤：
```

* 用if实现

```
int month = 15;
if(month>=3 && month<=5)
    System.out.println(month + "所对应的月份是春季");
else if(month>=6 && month<=8)
    System.out.println(month + "所对应的月份是夏季");
else if(month>=9 && month<=11)
    System.out.println(month + "所对应的月份是秋季");
else if(month>=1 && month<=2 || month==12)//point:不会？注意=与==的区别
    System.out.println(month + "所对应的月份是冬季");
else
    System.out.println(month + "没有所对应的季节");
```

* 优化一下顺序

```
int month = 1;
if(month<1 || month>12)  //最先判断不符合条件的情况，节省带宽
    System.out.println(month + "没有对应的季节");
else if(month>=3 && month<=5)
    System.out.println(month + "所对应的月份是春季");
else if(month>=6 && month<=8)
    System.out.println(month + "所对应的月份是夏季");
else if(month>=9 && month<=11)
    System.out.println(month + "所对应的月份是秋季");
else  //直接把不好操作的按照先后顺序放在了最后，其他情况
    System.out.println(month + "所对应的月份是冬季");
```

* 用switch实现

```
int month = 11;
switch(month)
{
    case 3://point:注意case的写法，case 3:
    case 4:
    case 5:
        System.out.println(month + "所对应的月份是春季");
        break;
    case 6://point:注意case的写法，case 3:
    case 7:
    case 8:
        System.out.println(month + "所对应的月份是夏季");
        break;
    case 9://point:注意case的写法，case 3:
    case 10:
    case 11:
        System.out.println(month + "所对应的月份是秋季");
        break;
    case 12://point:注意case的写法，case 3:
    case 1:
    case 2:
        System.out.println(month + "所对应的月份是冬季");
        break;
    default:
        System.out.println(month + "没有对应的季节");
        break;//最后一个break可以不写
}
```

### 2.案例二 —— 将十进制26转化成十六进制
```
思路：
1.将26的二进制以每4位的方式取出：用(1111)与26进行与&位运算取1
2.取下4位，变成最低4位来取：对原来数据进行无符号右移

步骤：
1.操作的整数不固定，定义变量x存储
2.对该变量进行与运算(15)(任何数与15，结果必然在15之内)
3.对原数据进行无符号右移4位（整数最多做8组右移运算，32个二进制位，int 4字节）

学到多少，用到多少，解决相关的部分问题:啰嗦着写
```

```
int num = 26;

//01：&15.获取最低四位
int n1 = num & 15;

//02：对于不在0~9之内的数字，怎么输出字母？
System.out.println("n1="+(char)(n1-10+'a'));  //10是大于9以上的数字，缩小回初始位置，再加上字母的序号

//03：对num进行右移
num = num >>> 4;

//04：再取&15.获取二进制位
int n2 = num & 15;
System.out.println("n2="+n2);  //注意，这里不要写：("n2="+(char)(n2+'0'))，这个是字符1，而不是整数1
```

* 问题与优化

```
存在的问题：
1.两次运算很重复
2.&15后的结果是否需要做字母转换，无法确定

优化：
1.通过循环完成重复运算
2.通过if完成是否需要转成字母的判断
```

```
int num = 26;//26=0x1A

for(int x=0 ; x<9 ; x++)
{
    int n = num & 15;
    if(n>9)
        System.out.println((char)(n-10+'A'));
    else
        System.out.println(n);
    num = num >>> 4;
}
```
* 仍有两个问题 -- 学到day05就能解决
	* 变量只能存储一个数，想要0x1A这样输出，需要用数组才能存储多个数
	* 1.数字顺序反了，2.多余0没有砍掉【需要用多数据存储】

### 3.案例三 —— 判断3个数中的最大值

* 思路：
1.两个相比较，较大的和剩下的比较
步骤：
1.定义三个存数变量 + 一个存最大值变量
2.if判断结构，放最大值

* 老师给定代码


```
int x = 10, y = 15,z = 20, max = 0;

int tempMax = x>y?x:y;
int max1 = tempMax>z?tempMax:z;
System.out.println(max1);
```
* 我自己写的代码，有点笨


```
if(x>y)
    max = x;
else
    max = y;
if(max>z)
    max = max;
else
    max = z;
System.out.println(max);
```

### 4.案例四 —— 屏幕上显示数字下三角

```
54321
5432
543
54
5
```

* 思路：
1.两个循环，外面定义行数，里面定义每行列数
2.怎么实现每行输出的数字倒数：


* 老师写的，不需要第三个变量

```
for(int x=0 ; x<5 ; x++)
{
    for(int y=5 ; y>x ; y--)//内循环负责打印54321，所以起始为5
    {
        System.out.print(y);
        //内循环循环的快，打印内循环的值，内循环初始值必定是5，而且输出的第一个元素为5，因此第一个元素值为5，然后递减1，一共5个元素；然后由5到2，一共4个元素，这样y的结束条件就与x的变化相同了
    }
    System.out.println();
}
```

* 我自己写的，比较笨


```
for(int x=5 ; x>0 ; x--)
{
    int a = 5;
    for(int y=0 ; y<x ; y++)
    {
        System.out.print(a);
        a--;
    }
    System.out.println();
}
```

### 5.案例五 —— 制作99乘法表

思路：
1.实现换行操作（第一行一个，第二行两个，...）
2.实现对每个式子进行换数值的操作，如何对每个乘数进行操作？
3.对每个式子乘完的结果展示

步骤：
1.定义两层for循环
2.定义三个变量 乘数1，乘数2，结果（有个在for循环内和外自增的过程）
3.最后的格式：同行加空格，非同行加回车

```
for(int x=1;x<=9;x++)
{
    for(int y=1;y<=x;y++)//能在一行内做变化的肯定是内循环
    {
        //int z=1; 
        //z=x*y;这都是屎啊
        
        System.out.print(y+"*"+x+"="+y*x+"\t");
        //*竟然需要用“”括起来，制表符是"\t"。换行\n(linux unix)或者\r(win)(dos两种都用)
    }
    System.out.println();
    System.out.println("\"hello world\"");
}
```
[>>>top<<<](#top)
