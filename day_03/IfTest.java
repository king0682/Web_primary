class IfTest
{
    public static void main(String[] args)
    {
        /*
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
        */

        //执行了一句之后，剩下的语句执行没有意义，所以不用第一种if-else结构，使用多条件一个结果 if-else语句
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