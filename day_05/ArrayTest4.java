class ArrayTest4
{
    public static void main(String[] args)
    {
        System.out.println(getWeek(6));
    }

    public static String getWeek(int num)
    {
        if(num>7 || num<1)
            //�������������ѡ��һ
            return num+"û�ж�Ӧ������";
            //throw new RuntimeException(num+"û�ж�Ӧ������");
        //1.����һ�����飬�洢�̶����������������˼�����Ҫ������������1-7������0���ؿգ�������˳����һ��λ��
   
        String[] weeks = {"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //�����֮Ϊ���洢�˶�Ӧ��ϵ�ı�
        return weeks[num];
        //���ϲ���Ϊ������ָ���������������ASCII��
    }
}