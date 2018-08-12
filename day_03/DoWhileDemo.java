class DoWhileDemo
{
    public static void main(String[] args)
    {
        /*
        do while格式--用的不多

        do
        {
            执行语句;
        }
        while(条件表达式);
        
         */
         //while与do while的区别
         //while:条件不满足就不运行
         //do while:条件无论满足与否，至少运行一次
         int x = 3;
         while(x < 3)
         {
             System.out.println("x="+x);
             x++;
         }

        System.out.println("while循环结束了！");

         int y = 3;
         do
         {
             System.out.println("y="+y);
             y++;
         }
        while(y<3);
    }
}