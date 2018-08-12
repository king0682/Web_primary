class VarDemo2
{
    public static void main(String[] args)
    {
        /*
        byte b = 4;//java中，不同类型的数据是不能进行运算的，但是byte和int却可以运算，因为只要都是数值型，就都可以运算，其中将byte自动类型提升（小向大提升），变成了int型
        int x = 3;
        x = x + b;
        System.out.println("x="+x);
        */

        /*编译只做语法检查，运行时期才进行运算
        byte b = 3;//可以自动类型提升，因为等号右面是常量
        b = b + 1;//需要byte，却给了一个int，不可以自动类型提升，因为等号右面有变量，开启了java的自动保护机制，以防b+1超出byte的范围(b=127)，所以报错提前预警，不能自动转换
        */
        
        /*强转
        byte b = 3;
        b = (byte)(b + 1);
        System.out.println("b="+b);
        */

        //因为有编码表，计算机能识别各个国家的文字
        char ch = 97;
        System.out.println("ch="+ch);

        char ch1 = 'a';
        System.out.println("ch1="+(ch1+1));//强制转换，从二字节变成四字节

        char ch2 = 'a';
        System.out.println("ch2="+(char)(ch2+1));
    }
}