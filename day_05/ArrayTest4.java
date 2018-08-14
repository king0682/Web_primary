class ArrayTest4
{
    public static void main(String[] args)
    {
        System.out.println(getWeek(6));
    }

    public static String getWeek(int num)
    {
        if(num>7 || num<1)
            //以下两条语句任选其一
            return num+"没有对应的星期";
            //throw new RuntimeException(num+"没有对应的星期");
        //1.定义一个数组，存储固定星期数，“”这个思想很重要，正常人输入1-7，输入0返回空，还往后顺延了一个位置
   
        String[] weeks = {"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //上面称之为表：存储了对应关系的表。
        return weeks[num];
        //以上操作为：根据指定索引查表（类似于ASCII）
    }
}