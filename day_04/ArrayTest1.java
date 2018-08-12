class ArrayTest1
{
    public static void main(String[] args)
    {
        int[] arr = {23,15,67,25,90,33};
        int max = getMax_1(arr);
        System.out.println(max);
    }
    /*
    需求：获取多个整数的最大值
    
    思路：
    1.数据多了，为了便于存储，先存起来，需要容器，需要数组（一旦初始化，长度固定了，不能删除元素）
    2.多个数据需要进行比较，每次将较大的数记录下来，和下一个进行比较
    3.将数组中的元素都比较一遍，最后，有了最大值
    
    步骤：
    1.需要数组
    2.定义变量记录较大的数
    3.对数组进行遍历：让元素与较大的金进行比较，如果元素大于较大的数，用变量记录盖元素
    4.遍历结束，变量中记录的就是最大值
    */

    //定义功能
    /*
    明确1：结果？int，最大值
    明确2：参数？数组int[]
    */
    public static int getMax(int[] arr)
    {
        
        //1.定义变量，初始化为数组中任意一个元素，建议第一个
        int max = arr[0];
        //2.遍历数组
        for(int x=1 ; x<arr.length ; x++)
        {
            if(arr[x]>max)
                max = arr[x];
        }
        return max;
    }

    public static int getMax_1(int[] arr)
    {
        int max = 0;//max存储的是最大值的角标
        for(int x=1; x<arr.length ; x++)
        {
            if(arr[x]>arr[max])
                max = x;
        }
        return arr[max];
    }
}
    //如何学习代码？1.看代码时，看明白写一句注释 2.看完之后，就自己试着去写一遍（写不下去了，就再对着表达看一遍）