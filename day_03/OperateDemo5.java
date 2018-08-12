class OperateDemo5
{
    public static void main(String[] args)
    {
        //三元运算符
        int x = 2,y;
        y = x>1?100:200;

        System.out.println("y="+y);

        //需求：有a,b,c三个不确定的数，想知道最大的是哪个？
        int a=4,b=80,c=20,z;
        z = a>b?a:b;
        z = c>z?c:z;
        System.out.println("max="+z);
    }
}