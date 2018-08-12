class ControlDemo1
{
    public static void main(String[] args)
    {
        //1、if格式一
        int x = 3;
        if(x > 1)
        {
            System.out.println("yes");
        }
        System.out.println("over");





        //2、if格式二
        /* 
        if(条件表达式)
        {
            执行语句一；
        }
        else
        {
            执行语句二；
        }
        */
        int a = 3;
        if(a>1)
        {
            System.out.println("男WC");
        }
        else
        {
            System.out.println("女WC");
        }

        /*if else与三元运算符区别--简化都是有弊端的
        三元运算符 可以理解是 if else 的缩写。但并不是所有if else都能缩写成三元，因为
        三元运算符运算完必须有一个结果，但是if else可以输出一个语句，而不是结果
        条件：当if else运算完有结果的时候，就可以转化成为三元运算符
        */
        int b = 1,c;
        if(b > 1)
        {
            c = 100;
        }
        else
        {
            c = 200;
        }


        /*3、if格式三
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
        */
        //1.if else中可以嵌套if
        //2.if的大括号可以省略，但是省略大括号的if只能带一条语句，否则就会出错

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
    }
}