class SwitchTest
{
    public static void main(String[] args)
    {
        /*if与switch的区别：
        if：可以判断数值，也可以判断区间，只要运算结果是boolean类型就可以
        switch：用于固定值的判断，而且判断值的类型有限。如果判断只有两种情况，那么用switch是最标准的（外国人常用），用if也可以
        */

        //需求：根据用户给定的数值，显示该数值对应的星期。
        int week = 3;

        switch(week)
        {
            case 1:
                System.out.println(week+"对应的是星期一");
                break;
            case 2:
                System.out.println(week+"对应的是星期二");
                break;
            case 3:
                System.out.println(week+"对应的是星期三");
                break;
            case 4:
                System.out.println(week+"对应的是星期四");
                break;
            case 5:
                System.out.println(week+"对应的是星期五");
                break;
            case 6:
                System.out.println(week+"对应的是星期六");
                break;
            case 7:
                System.out.println(week+"对应的是星期日");
                break;
            default:
                System.out.println(week+"没有对应的星期");
                break;
        }
    }
}