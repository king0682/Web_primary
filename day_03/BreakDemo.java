class BreakDemo
{
    public static void main(String[] args)
    {
        /*
        breakʹ�÷�Χ��switch�жϣ�ѭ��(for,whileϵ��)
        continue���÷�Χ��ѭ��(for,while)
        ע�⣺break,continue�������õ�ʱ�����治Ҫ������䣬��Ϊִ�в���
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
                break;//���break���Ƶ���forѭ��
            System.out.println("x="+x);
        }

        System.out.println("-----------");

        /*
        �������̣�
        1.x=0,y=0,���x=0,����һ��,x++
        2.x=1,y=0,���x=1,����һ��,x++
        3.x=2,y=0,���x=2,����һ��,x++
        4.x=3,������x<3������
        */
        for(int x=0; x<3 ;x++ )
        {
            for(int y=0; y<4 ;y++ )
            {
                System.out.println("x="+x);
                break;//���breakֻ���ڲ�ѭ��
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