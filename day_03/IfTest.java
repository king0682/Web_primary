class IfTest
{
    public static void main(String[] args)
    {
        /*
        1.���󣺸����û���������ֵ��չʾ����ֵ��Ӧ�����ڡ��磺2�����ڶ���
        2.˼·/���ʣ�
            1.��λ�ȡ��ֵ��
            �𰸣���Ϊ������Դ�ܶ࣬���Խ�����ͳһ����һ���������Ե����
             ���ñ���������������ݽ��в���
           
            2.��ֵ�ܶ࣬�������һ����ֵ���ܶ�Ӧһ�����ڣ�
            �𰸣�������ֵ�жϣ�ת��������
            
            3.�����ʾ��
            �𰸣�����������ʾ
        
        3.����/�������
            1.�����������¼����
            2.��if�������жϣ��������ж���䣩
            3.��ͬ������Ӧ��ͬ������
        */

        //ִ����һ��֮��ʣ�µ����ִ��û�����壬���Բ��õ�һ��if-else�ṹ��ʹ�ö�����һ����� if-else���
        //  1.�����������¼����
        int week = 2;
        //  2.��if�������жϣ��������ж���䣩
        if(week == 1) 
        //  3.��ͬ������Ӧ��ͬ������
            System.out.println(week+"��Ӧ��������һ");
        else if(week == 2)
            System.out.println(week+"��Ӧ�������ڶ�");
        else if(week == 3)
            System.out.println(week+"��Ӧ����������");
        else if(week == 4)
            System.out.println(week+"��Ӧ����������");
        else if(week == 5)
            System.out.println(week+"��Ӧ����������");
        else if(week == 6)
            System.out.println(week+"��Ӧ����������");
        else if(week == 7)
            System.out.println(week+"��Ӧ����������");
        else
            System.out.println(week+"û�ж�Ӧ������"); 
    }
}