class ArrayDemo3
{
    public static void main(String[] args)
    {
        //数组定义格式二：数组中有初始化值，不用定义数组长度
        int[] arr = new int[]{34,12,89};
        int[] arr1 = {34,12,89,50,11,78};

        for(int x=0; x<arr1.length; x++)//通过arr.length来获取数组长度
        {
            System.out.println("arr["+x+"]="+arr1[x]);
        }
    }
}