class ContinueDemo
{
    public static void main(String[] args)
    {
        /*
        continue只作用于循环结构
        作用：结束本次循环，开始下次循环
        */
        for(int x=0; x<10 ;x++)
        {
            if(x%2==0)
                continue;
            System.out.println("x="+x);
        }

        System.out.println("------------");
        
        //也可以使用外循环
        outer:for(int x=0; x<3 ;x++ )
        {
            inner:for(int y=0; y<4 ;y++ )
            {
                System.out.println("x="+x);
                continue outer;
            }
        }
    }
}