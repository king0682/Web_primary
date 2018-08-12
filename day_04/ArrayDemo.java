class ArrayDemo
{
    public static void main(String[] args)
    {
        /*
        意识：一旦数多了，先用数组/容器存起来，然后再进行操作
        
        数组的定义方式： 元素类型[] 数组名 = new 元素类型[元素个数/数组长度];

        好处：数组可以储存多个数据，而且可以对元素进行编号。
            从0开始，通过编号/索引完成对数组元素进行操作。
        
        */
        int[] arr = new int[3];//通过new关键字，创建一个数组实体，长度为3，元素类型为int，并且赋值。arr是数组类型的变量。//int是数组中的元素类型，而不是数组类型（数组里面装的都是int类型的元素）
        int arr1[] = new int[4];//也可以，上面的更常用
        
        arr = arr1;//原来长度为3，现在长度就为4了
        arr1[3] = 89;
        //sop(arr[0]);
        System.out.println(arr[3]);//int数组初始化值为0
    }
}