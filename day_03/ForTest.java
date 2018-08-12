class ForTest
{
    public static void main(String[] args)
    {
        /*
        需求：获取1-100之间6的倍数的个数

        思路：
        1.符合条件的个数未知？定义变量
        2.6的倍数怎么表示？整除6没有余数
        3.需要对1-100每个数都进行判断？使用循环，对记录个数的变量自增
        

        步骤：
        1.定义变量a，记录个数：记录1-100变化的数
        2.定义循环：遍历1-100，对1-100判断
        3.满足条件，个数变量b自增

        */
        //1.定义变量a，记录个数
        int count = 0;
        for(int x = 1; x<100 ; x++ )
        {
            if(x % 6 == 0)
                count++;
        }

        System.out.println("count="+count);
    }
}