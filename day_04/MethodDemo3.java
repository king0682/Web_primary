class MethodDemo3
{
    public static void main(String[] args)
    {
        add(2,3,5);
        System.out.println("Hello World!");
        printCFB();
    }
    //���أ���������ͬ�����ǲ����б�ͬ���ɣ�����ֵ������ͬ����޹ء�(����Java�ᱨ��������������ͬ�ĺ�������)
    
    //�������������Ϊ�����������Ĺ��ܣ�������ʲô�ģ��������֣������������֪������ʲô�ġ�����һ������ͬһ������
    
    //--------------�����������--------------------
    public static int add(int a,int b)
    {
        return a+b;
    }
    
    //�����������
    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }

    //����С�����ͬ������ʹ��
    public static double add(double a,double b)
    {
        return a+b;
    }

    //��Ҫ��100������������ͣ���ô�죬���ܶ���һ�ٸ������ɣ���ʱ������

    /*
    //-------------���ھžų˷��������(��ͨ��)----------------
    public static void printCFB()
    {
        for(int x=1; x<=9; x++)
        {
            for(int y=1; y<=x; y++)
            {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }

    public static void printCFB(int num)
    {
        for(int x=1; x<=num; x++)
        {
            for(int y=1; y<=x; y++)
            {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
    */
    //-------------���ھžų˷��������(�������)----------------
    public static void printCFB()//��Ϊ�ڶ������������һ�֣�����ֻ��һ���Ϳ�����
    {
        printCFB(9);
    }

    public static void printCFB(int num)
    {
        for(int x=1; x<=num; x++)
        {
            for(int y=1; y<=x; y++)
            {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    } 
}

/*
void show(int a,float b,char c){}
������Щ�������������������

a.int show(int x,float y,char z)//û���أ������б���ͬ���ú��������������������ͬһ���࣬��������õĲ�ȷ���ԣ�

b.void show(float b,int a,char c)/�����ˣ������б�ͬ

c.void show(int c,float a,char b)//û���أ������б���ͬ

d.void show(int a,float b,int c)//�����ˣ������б�ͬ

e.double show()//�����ˣ������б�ͬ
*/