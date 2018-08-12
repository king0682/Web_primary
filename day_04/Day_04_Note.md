# Day_04
## 一、函数
### No.1
#### 1.为什么要定义函数
* 方法(函数)：提高代码复用性，代码不能写在主函数中
#### 2.如何定义一个功能
    1.封闭区间，用大括号括起来
    2.有方法名称
    3.有参与运算的数据
    4.需要定义该功能的结果类型
#### 3.代码案例--画星正方体
```
class MethodDemo
{
    public static void main(String[] args)//主函数只能调用别人
    {
        draw(3,4);
    }

    static void draw(int row,int col)//void是返回值类型
    {
        if(row<0)
            return;//如果传进来的参数不符合条件，直接结束，不运行下面了
        
        for(int x=0; x<row; x++)
        {
            for(int y=0; y<col; y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //return;可以省略，但是javac编译后的class文件会自动带有return
    }
}
```
***
### No.2
#### 1.定义函数的格式
```
修饰符 返回值类型 函数名(参数类型 形式参数1，参数类型 形式参数2，...)
    {
        执行语句；
        return 返回值；//函数必须有return，return关键词用于结束该功能，并将后面具体结果返回给调用者--搬砖
    }
```
- 注意：函数的返回值类型是void--没有返回值，返回值为空，return语句可以省略不写或者return;

#### 2.函数方法三要素
- 返回结果，参数列表，函数名

#### 3.如何定义一个函数？
```
函数就是一个功能，两部分组成：1.结果 2.未知内容
明确1：功能的结果是什么？(返回值类型)
明确2：功能的未知内容是什么？（参数列表）
```

#### 4.代码案例--求两个数的加法
```
    需求：两个整数通过加法运算，获取两个整数的和
    
    明确1：功能的结果：和，整数，函数返回值类型int
    明确2：功能的未知内容：加数和被加数，类型int
    
```
**代码：**
```
class MethodDemo2
{
    public static void main(String[] args)
    {
        int sum = add(3,4);
        System.out.println(sum);
    }

    public static int add(int a,int b)
    {
        return a+b;
    }
}
```
**注意，以下的写法是不正确的**
```
    /*
    --开发不可以这么写，这样写证明自己明确自己想要定义的功能，思路瞎写。定义加法运算，但是并没有说需要打印。
    --定义功能，功能里面有什么就写什么，没有的千万不要写
    --如果要打印，分两个功能写，一个叫输出和，一个叫打印和：定义函数不要太多行，20行最多，写不下要分离出来
    */
    public static void add(int a,int b)
    {
        System.out.println(a+b);
        return;
    }
    
```

***
### NO.3
#### 1.重载Overload
+ 什么是重载？  
函数名相同，但是参数列表不同即可，返回值类型相同与否无关。(否则Java会报错，不允许两个相同的函数出现)
+ 函数名定义的意义？  
函数名定义就是为了描述函数的功能，函数做什么的，用以区分，单独提出来就知道是做什么的。功能一样都用同一个名字

#### 2.实例分析--求和的重载
+ 对两个整数进行求和
```
    public static int add(int a,int b)
    {
        return a+b;
    }
```
+ 对三个整数进行求和（参数列表不同）
```
    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }
```
+ 对两个小数进行求和（参数列表不同）
```
    public static double add(double a,double b)
    {
        return a+b;
    }
```  
+ 问题：想要对100个变量进行求和，怎么办，不能定义一百个变量吧：**用数组定义**

#### 3.实例分析--九九乘法表的重载

+ 普通版
```
public static void printCFB()//不给参数就输入 9*9
{
    for(int x=1; x<=9; x++)
    {
        for(int y=1; y<=x; y++)
        {
            System.out.print(y+"*"+x+"="+y*x+"\t");
        }
        System.out.println();
    }
}

public static void printCFB(int num)//给参数就输入 num*num
{
    for(int x=1; x<=num; x++)
    {
        for(int y=1; y<=x; y++)
        {
            System.out.print(y+"*"+x+"="+y*x+"\t");
        }
        System.out.println();
    }
}
```

+ 升级版
```
public static void printCFB()//因为第二种情况包含第一种，所以只用一个就可以了
{
    printCFB(9);
}

public static void printCFB(int num)
{
    for(int x=1; x<=num; x++)
    {
        for(int y=1; y<=x; y++)
        {
            System.out.print(y+"*"+x+"="+y*x+"\t");
        }
        System.out.println();
    }
}
```
#### 4.测验题
```
void show(int a,float b,char c){}
下列哪些函数与给定函数重载了

a.int show(int x,float y,char z)//没重载，参数列表相同（该函数不允许与给定函数在同一个类，会产生调用的不确定性）

b.void show(float b,int a,char c)//重载了，参数列表不同

c.void show(int c,float a,char b)//没重载，参数列表相同

d.void show(int a,float b,int c)//重载了，参数列表不同

e.double show()//重载了，参数列表不同
```
***

### 关于函数运行过程的内存变化
+ 专门存储运算语句的运行空间：栈
+ 函数被调用，运行完就会从栈中释放，将空间给其他函数使用：弹栈
+ 方法被调用：压栈
+ 手枪里打出子弹，特点先进后出
+ **作业：写个函数，画一下运行的内存图（main进栈，调用add进栈，赋值，运算结束出栈，sum=7，输出完sum出栈，结束），画出函数运行过程压栈入栈的流程图**
```
public static int add(int a,int b)
{
    return a+b;
}
```

***
## 二、数组
### Demo1
#### 养成意识
一旦数多了，先用数组/容器存起来，然后再进行操作

#### 数组定义方式
`元素类型[] 数组名 = new 元素类型[元素个数/数组长度];`

#### 定义数组的好处
    1.数组可以储存多个数据，而且可以对元素进行编号。
    2.从0开始，通过编号/索引完成对数组元素进行操作。
    
#### 定义一个数组（方式一）
```
public static void main(String[] args)
{
    
    int[] arr = new int[3];//通过new关键字，创建一个数组实体，长度为3，元素类型为int，并且赋值。arr是数组类型的变量。//int是数组中的元素类型，而不是数组类型（数组里面装的都是int类型的元素）
    int arr1[] = new int[4];//也可以，上面的更常用
    
    arr = arr1;//原来长度为3，现在长度就为4了
    arr1[3] = 89;
    //sop(arr[0]);
    System.out.println(arr[3]);//int数组初始化值为0
}
```

#### 定义一个数组（方式二）
```
public static void main(String[] args)
{
    //数组定义格式二：数组中有初始化值，不用定义数组长度
    int[] arr = new int[]{34,12,89};
    int[] arr1 = {34,12,89,50,11,78};

    for(int x=0; x<arr1.length; x++)//通过arr.length来获取数组长度
    {
        System.out.println("arr["+x+"]="+arr1[x]);
    }
}
```
***

### Demo2--数组常见异常

1.访问不存在索引异常
```
 public static void main(String[] args)
    {
        int[] arr = new int[3];
        System.out.println(arr[3]);
        //长度只有3，最后缺访问第四个数，出现ArrayIndexOutOfBoundsException
    }
```

2.使用没有任何实行，却要执行引用变量操作该实体时，发生异常
```
public static void main(String[] args)
    {
        arr = null;
        System.out.println(arr[0]);
        //NullPointerException
    }
```

***
### 代码实例1
+ 需求：获取多个数的和
+ 思路：  
    1. 将很多数记录下来  
    2. 依次将他们取出来，从而进行加和
+ 步骤：  
    1. 通过数组记录下来多个数
    2. 将其分别取出来，然后用for循环进行累加
+ 关于函数的需求
    1. 明确1：有结果么？有，是int
    2. 明确2：有参数么？有，是多个数/数组。定义多个参数不合适，既然是定义一组数，那么就是数组。

```
    public static void main(String[] args)
    {
        int[] arr = {23,14,22,88,45,90,17};
        int[] arr1 = {1,3,7,9,45};
        int sum = add(arr1);
        System.out.println(sum);
    }
    
    public static int add(int[] arr)//明确元素类型，不能什么都往里扔
    {
        //1.定义变量记录和
        int sum = 0;
        //2.通过循环对数组进行遍历
        for(int x=0; x<arr.length ;x++)
        {
            sum = sum + arr[x];
        }
        //3.返回和
        return sum;
    }
```

***

### 代码实例2

* 如何学习代码？ 
```
1.看代码时，看明白写一句注释  
2.看完之后，就自己试着去写一遍（写不下去了，就再对着表达看一遍）
```
* 关于编译：
```
1.编译的目的：检查语法错误，编译时内存不产生数组，只有在运行java 类的时候才会产生数组，运行时才能看到代码哪里有问题。
2.错误的分类
    1.编译时的错误提示
    2.运行时的错误提示
```
+ 需求：获取多个整数的最大值
    
+ 思路：  
    1. 数据多了，为了便于存储，先存起来，需要容器，需要数组（一旦初始化，长度固定了，不能删除元素）  
    2. 多个数据需要进行比较，每次将较大的数记录下来，和下一个进行比较  
    3. 将数组中的元素都比较一遍，最后，有了最大值
    
+ 步骤：  
    1. 需要数组  
    2. 定义变量记录较大的数  
    3. 对数组进行遍历：让元素与较大的金进行比较，如果元素大于较大的数，用变量记录盖元素  
    4. 遍历结束，变量中记录的就是最大值

+ 定义功能：  
    1. 明确1：结果？int，最大值  
    2. 明确2：参数？数组int[]

代码：
```
    public static void main(String[] args)
    {
        int[] arr = {23,15,67,25,90,33};
        int max = getMax_1(arr);
        System.out.println(max);
    }
    
    public static int getMax(int[] arr)
    {
        
        //1.定义变量，初始化为数组中任意一个元素，建议第一个
        int max = arr[0];
        //2.遍历数组
        for(int x=1 ; x<arr.length ; x++)
        {
            if(arr[x]>max)
                max = arr[x];
        }
        return max;
    }
    
    public static int getMax_1(int[] arr)
    {
        int max = 0;//max存储的是最大值的角标
        for(int x=1; x<arr.length ; x++)
        {
            if(arr[x]>arr[max])
                max = x;
        }
        return arr[max];
    }
```
***
## 关于内存
![](http://jiantuku-imag.oss-cn-beijing.aliyuncs.com/18-8-11/74761153.jpg)
![](http://pd6km3lkh.bkt.clouddn.com/18-8-11/64824315.jpg)
