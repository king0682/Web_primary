class ContinueDemo
{
    public static void main(String[] args)
    {
        /*
        continueֻ������ѭ���ṹ
        ���ã���������ѭ������ʼ�´�ѭ��
        */
        for(int x=0; x<10 ;x++)
        {
            if(x%2==0)
                continue;
            System.out.println("x="+x);
        }

        System.out.println("------------");
        
        //Ҳ����ʹ����ѭ��
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