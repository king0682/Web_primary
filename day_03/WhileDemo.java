class WhileDemo
{
    public static void main(String[] args)
    {
        /* 
        ѭ���ṹ��
        ʲôʱ���ã�����ĳЩ�����Ҫִ�кܶ�ε�ʱ��ʹ��
        */
        //ע��while()����û��:��;������ͻ���ֲ������ʣ�����ѭ��--while(x<3);û��ѭ���壬һֱ����x<3?
        int x = 1;
        while(x<3)
        {
            System.out.println("x="+x);
            ++x;
        }

        System.out.println("finish!");
        /*�ֲ�����飺�����κγ������Լ
        {
            System.out.println("x="+x);
            ++x;
        }        
        */
    }
}