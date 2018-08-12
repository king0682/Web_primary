class ForForDemo
{
    public static void main(String[] args)
    {
        for(int x=0; x<3; x++)
        {   
            for(int y=0; y<4; y++)
            {
                System.out.println("y="+y);
            }
        }

        System.out.println("-----------");
        
        for(int x=0; x<3; x++)
        {   
            for(int y=0; y<4; y++)
            {
                System.out.println("*");
            }
        }

        System.out.println("-----------");

        for(int x=0; x<3; x++)//控制行
        {   
            for(int y=0; y<4; y++)//控制列/每一行的个数
            {
                System.out.print("*");
            }
            System.out.println();//只是换行作用
        }
    }
}