class ArrayTest3
{
    public static void main(String[] args)
    {
        int[] arr = {34,12,67,90};
        String str = toString(arr);
        System.out.println(str);
    }
    /*
    需求：将数组{34,12,67}中的元素转成字符串“[34,12,67]”

    明确1：结果？char
    明确2：参数？数组

    思路：
    1.将数从数组中读出来
    2.用连字符将读出的数加起来：字符串与任何数据相加都是相连接”5+5=“+5+5
    
    步骤：
    1.定义字符串变量
    2.定义循环遍历数组，将每个数组元素与字符串相连接
    3.将连接后的字符串返回
    */
    public static String toString(int[] arr)//注意这里返回值类型使用的是String，而不是char
    {
        //1.定义字符串变量
        String temp = "[";
        //2.定义循环遍历数组，将每个数组元素与字符串相连接
        for(int x=0 ; x<arr.length ; x++)
        {
            //判断是否是最后一个元素，不是的话加","，是的话不加
            if(x!=(arr.length - 1))
                temp = temp + arr[x] + ",";
            else
            temp = temp + arr[x] + "]";
        }
        //3.将连接后的字符串返回
        return temp;
    }
}