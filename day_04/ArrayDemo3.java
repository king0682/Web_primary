class ArrayDemo3
{
    public static void main(String[] args)
    {
        //���鶨���ʽ�����������г�ʼ��ֵ�����ö������鳤��
        int[] arr = new int[]{34,12,89};
        int[] arr1 = {34,12,89,50,11,78};

        for(int x=0; x<arr1.length; x++)//ͨ��arr.length����ȡ���鳤��
        {
            System.out.println("arr["+x+"]="+arr1[x]);
        }
    }
}