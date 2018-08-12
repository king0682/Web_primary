class OperateDemo2
{
    public static void main(String[] args)
    {
        /*
        赋值运算符：特殊功能，可以做自动转换 s = 4
        = += -= *= /= %=
        */
        short s = 4;
        //s = s + 5;//运行不通过，因为等号右面是变量，开启了防超范围的自我保护
        s+=5;//运行通过，因为他是赋值运算符，可以自动转换，s是short类型，而4是int类型，可以自动转换，不涉及丢失精度（常用） 

        /*
        比较运算符的运算结果，要么是true，要么是false
        */
        System.out.println(3==4);
        System.out.println(3!=4);

        /*逻辑运算符：用来连接boolean型表达式*/
        int x = 3;
        System.out.println(x>2 & x<5);
        System.out.println(x>2 | x<5);
        System.out.println(x>2 ^ x<5);
        //短路与&& 短路或||

        int y = 1;
        y>3 & y<6//(左假右真，结果为假，右面参加运算时使用，两面都参与运算)
        y>3 && y<6//(左假，结果为假，右面不看，运算效率高，左面假就不考虑右面)（常用）
        /*
        &：两面都参与运算
        &&：左面为false，右面不参与运算
        |：两面都参与运算
        ||：左面为true，右面不参与运算
        */
    }
}