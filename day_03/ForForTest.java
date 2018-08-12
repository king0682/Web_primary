class ForForTest
{
    public static void main(String[] args)
    {
        /*
        需求：在屏幕上显示以下图形。
        *****
        ****
        ***
        **
        *

        思路：
        1.5行组成，多行：循环搞定，外循环
        2.每行多个星：循环内还需要循环，负责每行内有多少个星，内循环
        总结：外面有n多变化，每个变化内又有n多变化，不假思索写for嵌套结构
        
        步骤
        1.for嵌套循环
        */

        //控制结束值
        int z = 5;
        for(int x=1; x<=5 ; x++)
        {
            for(int y=1; y<=z ; y++)
            {
                System.out.print("*");
            }
            z--;
            System.out.println();
        }

        //控制起始值
        int a=1;
        for(int i=1 ; i<=5 ; i++ )
        {
            for(int j=a ; j<=5 ; j++ )
            {
                System.out.print("@");
            }
            a++;
            System.out.println();
        }

        //反向最简化的1
        for(int i=1 ; i<=5 ; i++ )
        {
            for(int j=i ; j<=5 ; j++ )
            {
                System.out.print("&");
            }
            System.out.println();
        }

        //反向最简化的2
        for(int i=5 ; i>=1 ; i-- )
        {
            for(int j=i ; j>=1 ; j-- )
            {
                System.out.print("O");
            }
            System.out.println();
        }

        //正向
        for(int i=1 ; i<=5 ; i++ )
        {
            for(int j=1 ; j<=i ; j++ )
            {
                System.out.print("B");
            }
            System.out.println();
        }
    }
}