class MethodDemo
{
    public static void main(String[] args)//������ֻ�ܵ��ñ���
    {
        draw(3,4);
    }

    /*
    ��ζ���һ�����ܣ�
    1.������䣬�ô�����������
    2.�з�������
    3.�в������������
    4.��Ҫ����ù��ܵĽ������
    */
    static void draw(int row,int col)//����(����)����ߴ��븴���ԣ����벻��д����������
    {
        if(row<0)
            return;//����������Ĳ���������������ֱ�ӽ�����������������
        
        for(int x=0; x<row; x++)//void�Ƿ���ֵ����
        {
            for(int y=0; y<col; y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //return;����ʡ�ԣ�����javac������class�ļ���return
    }
}