class ControlDemo1
{
    public static void main(String[] args)
    {
        //1��if��ʽһ
        int x = 3;
        if(x > 1)
        {
            System.out.println("yes");
        }
        System.out.println("over");





        //2��if��ʽ��
        /* 
        if(�������ʽ)
        {
            ִ�����һ��
        }
        else
        {
            ִ��������
        }
        */
        int a = 3;
        if(a>1)
        {
            System.out.println("��WC");
        }
        else
        {
            System.out.println("ŮWC");
        }

        /*if else����Ԫ���������--�򻯶����б׶˵�
        ��Ԫ����� ��������� if else ����д��������������if else������д����Ԫ����Ϊ
        ��Ԫ����������������һ�����������if else�������һ����䣬�����ǽ��
        ��������if else�������н����ʱ�򣬾Ϳ���ת����Ϊ��Ԫ�����
        */
        int b = 1,c;
        if(b > 1)
        {
            c = 100;
        }
        else
        {
            c = 200;
        }


        /*3��if��ʽ��
        if(�������ʽ1)
        {
            ִ�����1��
        }
        else if���������ʽ2��
        {
            ִ�����2��
        }
        else
        {
            ִ�����3��
        }
        */
        //1.if else�п���Ƕ��if
        //2.if�Ĵ����ſ���ʡ�ԣ�����ʡ�Դ����ŵ�ifֻ�ܴ�һ����䣬����ͻ����

        int i = 11;

        if(i < 1)
        {
            System.out.println("a");
        }
        else if(i >= 1 && i < 3)
        {
            System.out.println("b");
        }
        else if(i >= 3 && i < 8)
        {
            System.out.println("c");
        }
        else
        {
            System.out.println("d");
        }
    }
}