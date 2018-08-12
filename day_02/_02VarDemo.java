class VarDemo
{
    public static void main(String[] args)
    {
        //数据类型 变量名 = 初始化值；
        byte b = 3;//一两的碗装四两袋子的米，但是袋子里只有一两，编译器检查，6在byte范围内，可以自动转型，默认int，四个八位
        short s = 4;
        int i = 7;

        /*long l = 12345678900;出现过大的整数，因为右面的数值已经超出了int的范围，
        但是没有超出long的范围，想要把这个整数存到long中，就需要将其从int转换成为long
        需要在结尾处添加一个l*/
        long l = 12345678900l;

        float f = 2.3f;//小数后面加f可以表示单精度存储，而2.3默认的是double类型

        double d = 3.4;

        char c = '1';

        boolean bo = true;//bo = false;
    }
}