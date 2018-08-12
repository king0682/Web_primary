class Test
{
    public static void main(String[] args)
    {
        /*
        需求1：根据用户给定的月份数据，指出该月份属于哪个季节
        3,4,5   春季
        6,7,8   夏季
        9,10,11 秋季
        12,1,2  冬季

        思路：
        1.接受用户输入数据，定义变量x
        2.判断x属于哪几个月份，用if判断，并且输出回答
        3.对于没有月份的选项，other

        步骤：
        */
        /*
        int month = 15;
        if(month>=3 && month<=5)
            System.out.println(month + "所对应的月份是春季");
        else if(month>=6 && month<=8)
            System.out.println(month + "所对应的月份是夏季");
        else if(month>=9 && month<=11)
            System.out.println(month + "所对应的月份是秋季");
        else if(month>=1 && month<=2 || month==12)//point:不会？注意=与==的区别
            System.out.println(month + "所对应的月份是冬季");
        else
            System.out.println(month + "没有所对应的季节");
        */

        /*
        //优化
        int month = 1;
        if(month<1 || month>12)
            System.out.println(month + "没有对应的季节");
        else if(month>=3 && month<=5)
            System.out.println(month + "所对应的月份是春季");
        else if(month>=6 && month<=8)
            System.out.println(month + "所对应的月份是夏季");
        else if(month>=9 && month<=11)
            System.out.println(month + "所对应的月份是秋季");
        else//直接把不好操作的按照先后顺序放在了最后
            System.out.println(month + "所对应的月份是冬季");
        */

        /*用switch实现
        int month = 11;
        switch(month)
        {
            case 3://point:注意case的写法，case 3:
            case 4:
            case 5:
                System.out.println(month + "所对应的月份是春季");
                break;
            case 6://point:注意case的写法，case 3:
            case 7:
            case 8:
                System.out.println(month + "所对应的月份是夏季");
                break;
            case 9://point:注意case的写法，case 3:
            case 10:
            case 11:
                System.out.println(month + "所对应的月份是秋季");
                break;
            case 12://point:注意case的写法，case 3:
            case 1:
            case 2:
                System.out.println(month + "所对应的月份是冬季");
                break;
            default:
                System.out.println(month + "没有对应的季节");
                break;//最后一个break可以不写
        }
        */
//---------------------------------------------------
            /*需求2：将十进制26转化成十六进制
            思路：
            1.将26的二进制以每4位的方式取出：用(1111)与26进行与&位运算取1
            2.取下4位，变成最低4位来取：对原来数据进行无符号右移

            步骤：
            1.操作的整数不固定，定义变量x存储
            2.对该变量进行与运算(15)(任何数与15，结果必然在15之内)
            3.对原数据进行无符号右移4位（整数最多做8组右移运算，32个二进制位，int 4字节）

            学到多少，用到多少，解决相关的部分问题:啰嗦着写
            */

            /*
            int num = 26;
            
            //&15.获取最低四位
            int n1 = num & 15;
            //对于不在0~9之内的数字，怎么输出字母？
            System.out.println("n1="+(char)(n1-10+'a'));//10是大于9以上的数字，缩小回初始位置，再加上字母的序号
            
            //对num进行右移
            num = num >>> 4;

            //再取&15.获取二进制位
            int n2 = num & 15;
            System.out.println("n2="+n2);//注意，这里不要写：("n2="+(char)(n2+'0'))，这个是字符1，而不是整数1
            */

            /*
            问题：
            1.两次运算很重复
            2.&15后的结果是否需要做字母转换，无法确定

            优化：
            1.通过循环完成重复运算
            2.通过if完成是否需要转成字母的判断
            */

            /*
            int num = 26;//26=0x1A

            for(int x=0 ; x<9 ; x++)
            {
                int n = num & 15;
                if(n>9)
                    System.out.println((char)(n-10+'A'));
                else
                    System.out.println(n);
                num = num >>> 4;
            }
            */

            //但是这里仍有一个缺点：变量只能存储一个数，想要0x1A这样输出，需要用数组才能存储多个数
            //后续两个问题：1.反了，2多0没有砍掉【需要用多数据存储】
//---------------------------------------------------
            /*需求3：判断3个数中的最大值
            思路：
            1.两个相比较，较大的和剩下的比较
            步骤：
            1.定义三个存数变量 + 一个存最大值变量
            2.if判断结构，放最大值
            */

            /*
            int x = 10, y = 15,z = 20, max = 0;

            int tempMax = x>y?x:y;
            int max1 = tempMax>z?tempMax:z;
            System.out.println(max1);
            */
            
            /*我自己写的，有点弱智
            if(x>y)
                max = x;
            else
                max = y;
            if(max>z)
                max = max;
            else
                max = z;
            System.out.println(max);
            */

//---------------------------------------------------
            /*
            需求4：屏幕上显示
            54321
            5432
            543
            54
            5

            思路：
            1.两个循环，外面定义行数，里面定义每行列数
            2.怎么实现每行输出的数字倒数：
            步骤：
            1.
            */

            /*
            老师写的，不需要第三个变量


            for(int x=0 ; x<5 ; x++)
            {
                for(int y=5 ; y>x ; y--)//内循环负责打印54321，所以起始为5
                {
                    System.out.print(y);//内循环循环的快，打印内循环的值，内循环初始值必定是5，而且输出的第一个元素为5，因此第一个元素值为5，然后递减1，一共5个元素；然后由5到2，一共4个元素，这样y的结束条件就与x的变化相同了
                }
                System.out.println();
            }
            */
            

            /*我自己写的，比较笨
            for(int x=5 ; x>0 ; x--)
            {
                int a = 5;
                for(int y=0 ; y<x ; y++)
                {
                    System.out.print(a);
                    a--;
                }
                System.out.println();
            }
            */

//---------------------------------------------------
            /*
            需求5：制作99乘法表
            
            思路：
            1.实现换行操作（第一行一个，第二行两个，...）
            2.实现对每个式子进行换数值的操作，如何对每个乘数进行操作？
            3.对每个式子乘完的结果展示
            
            步骤：
            1.定义两层for循环
            2.定义三个变量 乘数1，乘数2，结果（有个在for循环内和外自增的过程）
            3.最后的格式：同行加空格，非同行加回车
            */            
            for(int x=1;x<=9;x++)
            {
                for(int y=1;y<=x;y++)//能在一行内做变化的肯定是内循环
                {
                    //int z=1; 
                    //z=x*y;这都是屎啊
                    System.out.print(y+"*"+x+"="+y*x+"\t");//*竟然需要用“”括起来，制表符是"\t"。换行\n(linux unix)或者\r(win)(dos两种都用)
                }
                System.out.println();
                System.out.println("\"hello world\"");
            }
    }
}