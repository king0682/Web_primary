class OperateDemo4
{
    public static void main(String[] args)
    {
        //<<������λ��2^2�����Ƽ�λ���Ǽ����ݣ����ã�ֻ�������2�ı����ĳ˷��������ٶȿ졣
        System.out.println(6<<2);

        //>>���Ƴ�����2��������������ԭ���λ��ʲô�����λ��ʲô(�������λ��1���������λ��0)

        /*>>>�޷������ƣ�����ԭ���λ��1������0�����λ����0��
        �÷�������Ҫ��һ������ȡ�˽���/ʮ������ʱ��ÿ������λһȡ����������ǰ˽��ƣ����λһֱ����0*/

        //�޷������ƣ�����2�Ĵ��ݵĳ˳����㣬���뵽λ�ƣ������һ�ζ�����λ�����޷�������

        //�룺����ȡ������������Ҫ��������ȡ��Ч��1(��ȡ����λ������00000111)�������ȡ00101011�е�101�Ļ�������>>>�����ƶ���λ

        //���һ�������������һ����ʱ��������Ǳ�����6^3^3=6(���ּ��ܣ�ÿ���ֽڶ����3һ�Σ����ܣ������3һ��)

        //ȡ����-6 = ~6+1  0110 ~ 1001(-7)[��1ȡ����0111�����Ϊ7����ôԭ��������-7]
    }
}