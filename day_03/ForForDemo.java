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

        for(int x=0; x<3; x++)//������
        {   
            for(int y=0; y<4; y++)//������/ÿһ�еĸ���
            {
                System.out.print("*");
            }
            System.out.println();//ֻ�ǻ�������
        }
    }
}