class ArrayTest3
{
    public static void main(String[] args)
    {
        int[] arr = {34,12,67,90};
        String str = toString(arr);
        System.out.println(str);
    }
    /*
    ���󣺽�����{34,12,67}�е�Ԫ��ת���ַ�����[34,12,67]��

    ��ȷ1�������char
    ��ȷ2������������

    ˼·��
    1.�����������ж�����
    2.�����ַ��������������������ַ������κ�������Ӷ��������ӡ�5+5=��+5+5
    
    ���裺
    1.�����ַ�������
    2.����ѭ���������飬��ÿ������Ԫ�����ַ���������
    3.�����Ӻ���ַ�������
    */
    public static String toString(int[] arr)//ע�����ﷵ��ֵ����ʹ�õ���String��������char
    {
        //1.�����ַ�������
        String temp = "[";
        //2.����ѭ���������飬��ÿ������Ԫ�����ַ���������
        for(int x=0 ; x<arr.length ; x++)
        {
            //�ж��Ƿ������һ��Ԫ�أ����ǵĻ���","���ǵĻ�����
            if(x!=(arr.length - 1))
                temp = temp + arr[x] + ",";
            else
            temp = temp + arr[x] + "]";
        }
        //3.�����Ӻ���ַ�������
        return temp;
    }
}