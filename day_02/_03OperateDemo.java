class OperateDemo
{
    public static void main(String[] args)
    {
        int x = 2810;
        System.out.println(x/1000);//ע����������С�������������Զ�ʡȥ��
        System.out.println(5%2);//���Ϊ1
        System.out.println(2%5);//���Ϊ2
        System.out.println(-2%5);//����������ֻ�������棬����Ϊ�����Ǹ����������Ϊ-2
        System.out.println(2%-5); //�������Ϊ2
        //1.�κ���ģ2�������0��1��ģ�⿪���㷨���л�
        //2.�κ���ģ���㷨����һ����������3���ڣ���%3��


        /*
        ++����������ԭ������+1
        �����������Ƕ������ʱ��a++��a--û������
        �������������������ʱ��������
        b = a++:��ԭʼ��a��ֵ��b
        b = ++a:���������a��ֵ��b(����)
        */

        int a = 3 ,b;
        b = ++a;
        System.out.println("a="+a+" b="+b);

        int c = 3, d;
        d = c++;
        System.out.println("c="+c+" d="+d);
        System.out.println("5"+5);        
        System.out.println("5+5="+(5+5));
        System.out.println("5+5="+5+5);
    }
}