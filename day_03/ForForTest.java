class ForForTest
{
    public static void main(String[] args)
    {
        /*
        ��������Ļ����ʾ����ͼ�Ρ�
        *****
        ****
        ***
        **
        *

        ˼·��
        1.5����ɣ����У�ѭ���㶨����ѭ��
        2.ÿ�ж���ǣ�ѭ���ڻ���Ҫѭ��������ÿ�����ж��ٸ��ǣ���ѭ��
        �ܽ᣺������n��仯��ÿ���仯������n��仯������˼��дforǶ�׽ṹ
        
        ����
        1.forǶ��ѭ��
        */

        //���ƽ���ֵ
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

        //������ʼֵ
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

        //������򻯵�1
        for(int i=1 ; i<=5 ; i++ )
        {
            for(int j=i ; j<=5 ; j++ )
            {
                System.out.print("&");
            }
            System.out.println();
        }

        //������򻯵�2
        for(int i=5 ; i>=1 ; i-- )
        {
            for(int j=i ; j>=1 ; j-- )
            {
                System.out.print("O");
            }
            System.out.println();
        }

        //����
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