class ForTest
{
    public static void main(String[] args)
    {
        /*
        ���󣺻�ȡ1-100֮��6�ı����ĸ���

        ˼·��
        1.���������ĸ���δ֪���������
        2.6�ı�����ô��ʾ������6û������
        3.��Ҫ��1-100ÿ�����������жϣ�ʹ��ѭ�����Լ�¼�����ı�������
        

        ���裺
        1.�������a����¼��������¼1-100�仯����
        2.����ѭ��������1-100����1-100�ж�
        3.������������������b����

        */
        //1.�������a����¼����
        int count = 0;
        for(int x = 1; x<100 ; x++ )
        {
            if(x % 6 == 0)
                count++;
        }

        System.out.println("count="+count);
    }
}