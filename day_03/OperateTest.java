class OperateTest
{
    public static void main(String[] args)
    {
        //练习：在不借助第三方变量的情况下，交换两个整数变量
        int a = 3, b = 7;

        /*通过第三方变量进行置换
        int temp = a;
        a = b;
        b = temp;
        */

        /*通过和的形式：两个数据较大，可能会超出范围
        a = a + b;
        b = a - b;
        a = a - b;
        */

        /*用异或(很重要)：进行位运算就不需要担心超出范围的事情
        7^3^3=7 ; 7^3^7=3*/
        a = a ^ b;// a = 3 ^ 7;
        b = a ^ b;// b = 3 ^ 7 ^ 7 = 3;
        a = a ^ b;// a = 3 ^ 7 ^ 3 = 7;
        
        System.out.println("a="+a+" b="+b);
    }
}