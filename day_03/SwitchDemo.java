class SwitchDemo
{
    public static void main(String[] args)
    {
        //case:���������Ӷ�����䣬ð�Ŵ���������ֺŴ������
        //switch��λ�ðڷ�û��˳��default���Է������档����ִ��˳��ȴ��˳�򣬰��հڷ�˳��ִ�У����ִ��default
    
        /*
        switch(���ʽ)  //ע�ⲻ���������ʽ
        {
            case ȡֵ1:
                ִ�����;
                break;
            
            case ȡֵ2:
                ִ�����;
                break;
            ....
            default:
                ִ�����;
                break;                            
        }
        */

        /*
        switch�����ص�
        1.�𰸵���дû��˳�򣬵���ִ��ȴ��˳��
        2.ƥ��Ĵ𰸱�ִ�У�һֱִ�е�break����switchĩβ���ţ����һ��caseҲ��û��break���Ž���
        3.switch������жϱ����ķ�Χ��byte,short,int,char,enum(5.0),String(7.0)
        */
        int x = 2;
        switch(x){
            //1.�����
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


        //�����һ����ʽ�����default��˳����Ȼ����󣬵������x=5�Ļ���default����case5��һ����
        switch(x){
            //1.�����
            case 5:
                System.out.println("a");
                //break;

            default:
                System.out.println("c");
                break;                
                
            case 3:
                System.out.println("b");
                break;

        //  �������������xҪ�㵽default�У������cb����Ϊһֱ����break�Ž���
        /*
        int x = 2;
        switch(x){
            //1.�����
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