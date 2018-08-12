class ArrayDemo2
{
    public static void main(String[] args)
    {
        int[] arr = new int[3];
        System.out.println(arr[3]);
        //长度只有3，最后缺访问第四个数，出现ArrayIndexOutOfBoundsException：访问到了数组不存在的索引时，发生该异常

        arr = null;
        System.out.println(arr[0]);
        //NullPointerException：当使用没有任何实体执行的引用变量操作实体时，发生该异常
    }
}