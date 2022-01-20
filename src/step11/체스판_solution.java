package step11;

import java.util.Scanner;

public class 체스판_solution {

    public static void main(String[] args) throws Exception{
    	char [][]b_origin = {
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
        };

        char [][]w_origin = {
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
        };
        
        int b_min=0;
        int w_min=0;

        Scanner sc = new Scanner(System.in);
        
        int y = sc.nextInt(); //����
        int x = sc.nextInt(); //����

        char [][] compare = new char[y][x] ;

        for (int i=0;i<y;i++) {
            compare[i] = sc.next().toCharArray();
           
        }//���� ü���� �Է¹���
        
        int min =Integer.MAX_VALUE;

        for (int i=0;i<=y-8;i++) {
            for (int j=0;j<=x-8;j++) {
                for (int t=0; t<8 ; t++) {
                    for (int c =0; c<8; c++) {
                        if (w_origin[t][c] != compare[t+i][c+j]) w_min++;
                        else if (b_origin[t][c] != compare[t+i][c+j]) b_min++;
                    }
                 }
                
                min = Integer.min(min,Integer.min(w_min,b_min));
                w_min=0;
                b_min=0;
            }
        }
        System.out.println(min);


    }

}