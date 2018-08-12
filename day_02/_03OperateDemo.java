class OperateDemo
{
    public static void main(String[] args)
    {
        int x = 2810;
        System.out.println(x/1000);//注意是整除，小数点后面的数被自动省去了
        System.out.println(5%2);//结果为1
        System.out.println(2%5);//结果为2
        System.out.println(-2%5);//负数运算结果只参照左面，左面为负就是负，本条结果为-2
        System.out.println(2%-5); //本条结果为2
        //1.任何数模2，结果非0即1，模拟开关算法的切换
        //2.任何数模（算法：将一个数控制在3以内，就%3）


        /*
        ++：自增，对原有数据+1
        当自增运算是独立语句时，a++与a--没有区别
        当自增运算与其他结合时，有区别：
        b = a++:将原始的a赋值给b
        b = ++a:将自增后的a赋值给b(常用)
        */

        int a = 3 ,b;
        b = ++a;
        System.out.println("a="+a+" b="+b);

        int c = 3, d;
        d = c++;
        System.out.println("c="+c+" d="+d);
        System.out.println("5"+5);        
        System.out.println("5+5="+(5+5));
        System.out.println("5+5="+5+5);
    }
}