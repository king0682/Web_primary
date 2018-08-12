class WhileTest
{
    public static void main(String[] args)
    {
        /*
        需求1：显示从1-10
        
        int x = 1;
        while(x<11)
        {
            System.out.println(x);
            x++;
        }
         */

         /*
         需求2：运算1-100的加和
         思路：
            1.每次重复的部分：和 + 下一个数，需要循环
            2.和确定么？不，需要变量
            3.下一个数确定么？不，需要变量，而且下一个数自增
         步骤：
            1.定义变量，一个记录和，一个记录下一个数
            2.需要循环
            3.循环内容：1.和+下一个数 2.自增
          */

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
    }
}