class MethodDemo
{
    public static void main(String[] args)//主函数只能调用别人
    {
        draw(3,4);
    }

    /*
    如何定义一个功能？
    1.封闭区间，用大括号括起来
    2.有方法名称
    3.有参与运算的数据
    4.需要定义该功能的结果类型
    */
    static void draw(int row,int col)//方法(函数)：提高代码复用性，代码不能写在主函数中
    {
        if(row<0)
            return;//如果传进来的参数不符合条件，直接结束，不运行下面了
        
        for(int x=0; x<row; x++)//void是返回值类型
        {
            for(int y=0; y<col; y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //return;可以省略，但是javac编译后的class文件有return
    }
}