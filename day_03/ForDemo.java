class ForDemo
{
    public static void main(String[] args)
    {
        /*
        for(��ʼ�����ʽ(1��)��ѭ���������ʽ��ѭ����Ĳ������ʽ)
        {
            ִ����䣺��ѭ���壩
        }
        */

        //����x�Ǿֲ�����������for���ѭ���Ͳ���ʹ��
        for(int x = 1; x<3; x++)
        {
            System.out.println("x="+x);
        }

        System.out.println("---------");
        //for��while������
        int y = 1;
        while(y<3)
        {
            System.out.println("y="+y);
            y++;
        }
        //���y��ȫ�ֱ������ܹ�����������main����
        System.out.println("---------");

        //��򵥵�����ѭ��

        
        while(true){}

        //for(; ;){}
        //forѭ����д�������ʽ��Ĭ��Ϊ�棬����while��for������ѭ������ͬʱ�ã������unreachable code
    }
}