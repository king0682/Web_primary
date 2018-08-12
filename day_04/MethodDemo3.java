class MethodDemo3
{
    public static void main(String[] args)
    {
        add(2,3,5);
        System.out.println("Hello World!");
        printCFB();
    }
    //重载：函数名相同，但是参数列表不同即可，返回值类型相同与否无关。(否则Java会报错，不允许两个相同的函数出现)
    
    //函数名定义就是为了描述函数的功能，函数做什么的，用以区分，单独提出来就知道是做什么的。功能一样都用同一个名字
    
    //--------------两个整数求和--------------------
    public static int add(int a,int b)
    {
        return a+b;
    }
    
    //三个整数求和
    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }

    //两个小数求和同样可以使用
    public static double add(double a,double b)
    {
        return a+b;
    }

    //想要对100个变量进行求和，怎么办，不能定义一百个变量吧，这时用数组

    /*
    //-------------关于九九乘法表的重载(普通版)----------------
    public static void printCFB()
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
    */
    //-------------关于九九乘法表的重载(升级版版)----------------
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
}

/*
void show(int a,float b,char c){}
下列哪些函数与给定函数重载了

a.int show(int x,float y,char z)//没重载，参数列表相同（该函数不允许与给定函数在同一个类，会产生调用的不确定性）

b.void show(float b,int a,char c)/重载了，参数列表不同

c.void show(int c,float a,char b)//没重载，参数列表相同

d.void show(int a,float b,int c)//重载了，参数列表不同

e.double show()//重载了，参数列表不同
*/