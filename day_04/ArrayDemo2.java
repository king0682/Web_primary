class ArrayDemo2
{
    public static void main(String[] args)
    {
        int[] arr = new int[3];
        System.out.println(arr[3]);
        //����ֻ��3�����ȱ���ʵ��ĸ���������ArrayIndexOutOfBoundsException�����ʵ������鲻���ڵ�����ʱ���������쳣

        arr = null;
        System.out.println(arr[0]);
        //NullPointerException����ʹ��û���κ�ʵ��ִ�е����ñ�������ʵ��ʱ���������쳣
    }
}