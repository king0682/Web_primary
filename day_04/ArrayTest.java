class ArrayTest
{
    public static void main(String[] args)
    {
        int[] arr = {23,14,22,88,45,90,17};
        int[] arr1 = {1,3,7,9,45};
        int sum = add(arr1);
        System.out.println(sum);
    }
    /*
    需求：获取多个数的和
    明确1：有结果么？有，是int
    明确2：有参数么？有，是多个数/数组。定义多个参数不合适，既然是定义一组数，那么就是数组。
    */
    public static int add(int[] arr)//明确元素类型，不能什么都往里扔
    {
        //1.定义变量记录和
        int sum = 0;
        //2.通过循环对数组进行遍历
        for(int x=0; x<arr.length ;x++)
        {
            sum = sum + arr[x];
        }
        //3.返回和
        return sum;
    }

    /*
    思路：
    1.将很多数记录下来
    2.依次将他们取出来，从而进行加和
    
    步骤：
    1.通过数组记录下来多个数
    2.将其分别取出来，然后用for循环进行累加
    */
}