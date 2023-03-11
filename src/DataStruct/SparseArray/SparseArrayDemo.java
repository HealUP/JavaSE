package DataStruct.SparseArray;

public class SparseArrayDemo {
    /*0:û������
    * 1����ɫ��
    * 2����ɫ��*/
    public static void main(String[] args) {
        //����һ��ԭʼ�Ķ�ά����11*11
        int chessArray[][] = new int[11][11];
        //��ֵ
        chessArray[1][2] = 4;
        chessArray[2][3] = 2;
//        chessArray[5][9] = 29;
        //���ԭʼ�Ķ�ά����
        System.out.println("ԭʼ��ά���飡");
        for (int[] row : chessArray) {
            for (int data:row){//��ȡÿһ����Ϊ�����ֵ
                System.out.printf("%d\t", data);//\t tab��
            }
            System.out.println();//�����ÿһ�е�11�����ͻ���
        }

        //����ά����תΪϡ������
        /*1 �ȱ�����ά���飬�õ�����ĸ���
        * 2 ������Ӧ��ϡ������ */

        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray[i][j] != 0){
                    sum += 1;
                }
            }
        }
        System.out.println("����ֵ�ĸ���Ϊ:"+sum);

        //2 ���ݷ���ֵ����������Ӧ��ϡ������
        int sparseArray[][] = new int[sum + 1][3];
        //��ϡ������ĵ�һ�У���0�У���ֵ
        sparseArray[0][0] = 11;//��
        sparseArray[0][1] = 11;//��
        sparseArray[0][2] = sum;//����ֵ�ĸ���
        //������ά���飬������ֵ��ŵ�ϡ��������
        int count = 0;//��¼�ǵڼ�����������  ��0��ʼ
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray[i][j] != 0){//������ֵ����ϡ��������
                    count++;
                   /* һ������ֵ�ŵ�ϡ��������У���Ҫ����ֵ��ȷ���������Ǵӵ�һ������ֵ��ʼ������1��ʼ���ٵ�����
                   ��1�м�¼����ֵ���У���2�м�¼����ֵ���У���3�м�¼����ֵ��ֵ����
                    ���ԡ�������>�е�ȷ��ͨ���ǵڼ�������ֵ��ȷ��,�е�ȷ����Ϊ������һ���Ƿ���ֵ��Ӧ�ĵڼ���*/
                    sparseArray[count][0] = i;// count �ͱ�ʾ���ֵĵڼ�������ֵ������ֵ��Ӧ��i �ŵ���һ��
                    sparseArray[count][1] = j;// count �ͱ�ʾ���ֵĵڼ�������ֵ������ֵ��Ӧ��j �ŵ��ڶ���
                    sparseArray[count][2] = chessArray[i][j];//  ��count������ֵ�ĵ����ж�Ӧ�ľ���ֵ����
                }
            }
        }
        System.out.println();
        System.out.println("ϡ�����飨�ﵽѹ����Ч������");
        //���ϡ������
      /*  for (int i = 0; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray.length; j++) {
                System.out.printf("%d\t",sparseArray[i][j]);
            }
            System.out.println();
        }*/

        //�������� ��Ϊ�Ͻ�����Ϊ��ȷ��ϡ������������Ƿ�һ��
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArray[i][0],sparseArray[i][1],sparseArray[i][2]);
        }

        //2��ϡ������ת��Ϊԭʼ����
        //��ȡϡ������ĵ�һ�У�����ԭʼ�����С������
        int chessArray2[][] = new int [sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {//�ڶ��п�ʼ��
            //��ȡϡ������,�����зֱ𸶸�ԭʼ��������У�����ٰ�ֵд��ԭʼ�����ֵ��
            chessArray2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        System.out.println("�ָ���ԭʼ����Ϊ��");
        for (int[] data : chessArray2) {
            for (int datum : data) {
                System.out.printf("%d\t",datum);
            }
            System.out.println();//����
        }
    }
}
