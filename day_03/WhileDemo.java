class WhileDemo
{
    public static void main(String[] args)
    {
        /* 
        循环结构：
        什么时候用？当对某些语句需要执行很多次的时候使用
        */
        //注意while()后面没有:和;，否则就会出现不断提问，有死循环--while(x<3);没有循环体，一直在问x<3?
        int x = 1;
        while(x<3)
        {
            System.out.println("x="+x);
            ++x;
        }

        System.out.println("finish!");
        /*局部代码块：不受任何程序的制约
        {
            System.out.println("x="+x);
            ++x;
        }        
        */
    }
}