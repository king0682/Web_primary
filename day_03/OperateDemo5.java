class OperateDemo5
{
    public static void main(String[] args)
    {
        //��Ԫ�����
        int x = 2,y;
        y = x>1?100:200;

        System.out.println("y="+y);

        //������a,b,c������ȷ����������֪���������ĸ���
        int a=4,b=80,c=20,z;
        z = a>b?a:b;
        z = c>z?c:z;
        System.out.println("max="+z);
    }
}