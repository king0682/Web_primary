class DoWhileDemo
{
    public static void main(String[] args)
    {
        /*
        do while��ʽ--�õĲ���

        do
        {
            ִ�����;
        }
        while(�������ʽ);
        
         */
         //while��do while������
         //while:����������Ͳ�����
         //do while:�����������������������һ��
         int x = 3;
         while(x < 3)
         {
             System.out.println("x="+x);
             x++;
         }

        System.out.println("whileѭ�������ˣ�");

         int y = 3;
         do
         {
             System.out.println("y="+y);
             y++;
         }
        while(y<3);
    }
}