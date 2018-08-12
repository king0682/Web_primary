class ForDemo
{
    public static void main(String[] args)
    {
        /*
        for(初始化表达式(1次)；循环条件表达式；循环后的操作表达式)
        {
            执行语句：（循环体）
        }
        */

        //其中x是局部变量，出了for这个循环就不好使了
        for(int x = 1; x<3; x++)
        {
            System.out.println("x="+x);
        }

        System.out.println("---------");
        //for和while的区别
        int y = 1;
        while(y<3)
        {
            System.out.println("y="+y);
            y++;
        }
        //这个y是全局变量，能够作用于整个main函数
        System.out.println("---------");

        //最简单的无限循环

        
        while(true){}

        //for(; ;){}
        //for循环不写条件表达式，默认为真，但是while和for两个死循环不能同时用，会造成unreachable code
    }
}