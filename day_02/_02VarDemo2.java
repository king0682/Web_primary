class VarDemo2
{
    public static void main(String[] args)
    {
        /*
        byte b = 4;//java�У���ͬ���͵������ǲ��ܽ�������ģ�����byte��intȴ�������㣬��ΪֻҪ������ֵ�ͣ��Ͷ��������㣬���н�byte�Զ�����������С����������������int��
        int x = 3;
        x = x + b;
        System.out.println("x="+x);
        */

        /*����ֻ���﷨��飬����ʱ�ڲŽ�������
        byte b = 3;//�����Զ�������������Ϊ�Ⱥ������ǳ���
        b = b + 1;//��Ҫbyte��ȴ����һ��int���������Զ�������������Ϊ�Ⱥ������б�����������java���Զ��������ƣ��Է�b+1����byte�ķ�Χ(b=127)�����Ա�����ǰԤ���������Զ�ת��
        */
        
        /*ǿת
        byte b = 3;
        b = (byte)(b + 1);
        System.out.println("b="+b);
        */

        //��Ϊ�б�����������ʶ��������ҵ�����
        char ch = 97;
        System.out.println("ch="+ch);

        char ch1 = 'a';
        System.out.println("ch1="+(ch1+1));//ǿ��ת�����Ӷ��ֽڱ�����ֽ�

        char ch2 = 'a';
        System.out.println("ch2="+(char)(ch2+1));
    }
}