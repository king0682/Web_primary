class BreakDemo
{
    public static void main(String[] args)
    {
        /*
        break使用范围：switch判断，循环(for,while系列)
        continue作用范围：循环(for,while)
        注意：break,continue单独作用的时候，下面不要定义语句，因为执行不到
        */

        for(int x=0; x<3 ;x++ )
        {
            System.out.println("x="+x);
            break;
        }
        
        System.out.println("-----------");

        for(int x=0; x<3 ;x++ )
        {
            if(x==1)
                break;//这个break控制的是for循环
            System.out.println("x="+x);
        }

        System.out.println("-----------");

        /*
        工作流程：
        1.x=0,y=0,输出x=0,跳上一层,x++
        2.x=1,y=0,输出x=1,跳上一层,x++
        3.x=2,y=0,输出x=2,跳上一层,x++
        4.x=3,不符合x<3，跳出
        */
        for(int x=0; x<3 ;x++ )
        {
            for(int y=0; y<4 ;y++ )
            {
                System.out.println("x="+x);
                break;//这个break只跳内层循环
            }
        }

        System.out.println("-----------");

        outer:for(int x=0; x<3 ;x++ )
        {
            inner:for(int y=0; y<4 ;y++ )
            {
                System.out.println("x="+x);
                break outer;
            }
        }
    }
}