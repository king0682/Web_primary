class SwitchTest
{
    public static void main(String[] args)
    {
        /*if��switch������
        if�������ж���ֵ��Ҳ�����ж����䣬ֻҪ��������boolean���;Ϳ���
        switch�����ڹ̶�ֵ���жϣ������ж�ֵ���������ޡ�����ж�ֻ�������������ô��switch�����׼�ģ�����˳��ã�����ifҲ����
        */

        //���󣺸����û���������ֵ����ʾ����ֵ��Ӧ�����ڡ�
        int week = 3;

        switch(week)
        {
            case 1:
                System.out.println(week+"��Ӧ��������һ");
                break;
            case 2:
                System.out.println(week+"��Ӧ�������ڶ�");
                break;
            case 3:
                System.out.println(week+"��Ӧ����������");
                break;
            case 4:
                System.out.println(week+"��Ӧ����������");
                break;
            case 5:
                System.out.println(week+"��Ӧ����������");
                break;
            case 6:
                System.out.println(week+"��Ӧ����������");
                break;
            case 7:
                System.out.println(week+"��Ӧ����������");
                break;
            default:
                System.out.println(week+"û�ж�Ӧ������");
                break;
        }
    }
}