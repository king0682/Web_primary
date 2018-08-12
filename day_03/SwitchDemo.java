class SwitchDemo
{
    public static void main(String[] args)
    {
        //case:后面可以添加多条语句，冒号代表继续，分号代表结束
        //switch的位置摆放没有顺序，default可以放在上面。但是执行顺序却有顺序，按照摆放顺序执行，最后执行default
    
        /*
        switch(表达式)  //注意不是条件表达式
        {
            case 取值1:
                执行语句;
                break;
            
            case 取值2:
                执行语句;
                break;
            ....
            default:
                执行语句;
                break;                            
        }
        */

        /*
        switch语句的特点
        1.答案的书写没有顺序，但是执行却有顺序
        2.匹配的答案被执行，一直执行到break或者switch末尾括号（最后一个case也是没有break）才结束
        3.switch语句能判断变量的范围：byte,short,int,char,enum(5.0),String(7.0)
        */
        int x = 2;
        switch(x){
            //1.定义答案
            case 5:
                System.out.println("a");
                break;
            case 3:
                System.out.println("b");
                break;
            default:
                System.out.println("c");
                break;
        }
        System.out.println("Hello World!");


        //如果是一下形式，这个default的顺序仍然是最后，但是如果x=5的话，default算是case5的一部分
        switch(x){
            //1.定义答案
            case 5:
                System.out.println("a");
                //break;

            default:
                System.out.println("c");
                break;                
                
            case 3:
                System.out.println("b");
                break;

        //  以下这种情况，x要算到default中，结果是cb，因为一直遇到break才结束
        /*
        int x = 2;
        switch(x){
            //1.定义答案
            case 5:
                System.out.println("a");
                //break;

            default:
                System.out.println("c");
                //break;                
                
            case 3:
                System.out.println("b");
                break;
            }

        */}
        System.out.println("Hello World!");
    
}
}