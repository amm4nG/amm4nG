package challange;
public class Challange {
    public static void main(String[] args) {
       int[][] luas = new int[20][30];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 30; j++) {
                
            }
            
        }
                //kotak pertama
                luas[0][2] = 1;
                luas[1][1] = 1;
                luas[1][2] = 1;
                luas[1][3] = 1;
                luas[1][4] = 1;
                luas[2][1] = 1;
                luas[2][2] = 1;
                luas[2][3] = 1;
                luas[3][2] = 1;
                int area_pertama = luas[0][2] +  luas[1][1] + luas[1][2] + luas[1][3] + luas[1][4] + luas[2][1] + luas[2][2] + luas[2][3] + luas[3][2]; 
                
                //kotak kedua
                luas[5][2] = 1;
                luas[6][1] = 1;
                luas[6][2] = 1;
                luas[6][3] = 1;
                luas[6][4] = 1;
                luas[7][2] = 1;
                luas[7][3] = 1;
                luas[8][3] = 1;
                int area_kedua = luas[5][2] + luas[6][1] + luas[6][2] + luas[6][3] + luas[6][4] + luas[7][2] + luas[7][3] + luas[8][3];
                
                //kotak ketiga
                luas[12][0] = 1;
                luas[12][1] = 1;
                luas[12][2] = 1;
                luas[12][3] = 1;
                luas[12][4] = 1;
                luas[13][1] = 1;
                luas[13][2] = 1;
                luas[14][2] = 1;
                luas[14][3] = 1;
                luas[14][4] = 1;
                luas[14][5] = 1;
                luas[15][3] = 1;
                luas[15][4] = 1;
                luas[16][4] = 1;
                luas[16][5] = 1;
                luas[17][4] = 1;
                int area_ketiga = luas[12][0] + luas[12][1] + luas[12][2] + luas[12][3] + luas[12][4] + luas[13][1] + luas[13][2] + luas[14][2] + luas[14][3]
                + luas[14][4] + luas[14][5] + luas[15][3] + luas[15][4] + luas[16][5] + luas[17][4];
                //kotak keempat
                luas[13][8] = 1;
                luas[13][9] = 1;
                luas[13][10] = 1;
                luas[13][11] = 1;
                luas[13][12] = 1;
                luas[13][13] = 1;
                luas[14][9] = 1;
                luas[15][9] = 1;
                luas[16][9] = 1;
                luas[17][9] = 1;
                luas[17][10] = 1;
                luas[17][11] = 1;
                int area_keempat = luas[13][8]+luas[13][9]+luas[13][10]+luas[13][11]+luas[13][12]+luas[13][13]+luas[14][9]+luas[15][9]+luas[16][9]+luas[17][9]
                +luas[17][10]+luas[17][11];
                
                //kotak kelima
                luas[6][9] = 1;
                luas[7][9] = 1;
                luas[7][10] = 1;
                luas[7][11] = 1;
                luas[7][12] = 1;
                luas[8][12] = 1;
                luas[9][12] = 1;
                luas[10][1] = 1;
                luas[10][12] = 1;
                luas[7][13] = 1;
                luas[8][9] = 1;
                luas[9][9] = 1;
                luas[10][9] = 1;
                int area_kelima = luas[6][9]+luas[7][9]+luas[7][10]+luas[7][11]+luas[7][12]+luas[8][12]+luas[9][12]+luas[10][1]+luas[10][12]+luas[7][13]+luas[8][9]
                +luas[9][9]+luas[10][9];
                
                //kotak keenam
                luas[1][14] = 1;
                luas[1][15] = 1;
                luas[2][13] = 1;
                luas[2][14] = 1;
                luas[2][15] = 1;
                luas[2][16] = 1;
                luas[3][13] = 1;
                luas[3][14] = 1;
                luas[3][15] = 1;
                luas[3][16] = 1;
                luas[3][17] = 1;
                luas[4][13] = 1;
                luas[4][14] = 1;
                luas[4][15] = 1;
                luas[4][16] = 1;
                luas[4][17] = 1;
                luas[5][15] = 1;
                luas[10][9] = 1;
                int area_keenam = luas[1][14]+luas[1][15]+luas[2][13]+luas[2][14]+luas[2][15]+luas[2][16]+luas[3][13]+luas[3][14]+luas[3][15]
                +luas[3][16]+luas[3][17]+luas[4][13]+luas[4][14]+luas[4][15]+luas[4][16]+luas[4][17]+luas[5][15]+luas[10][9];
                
                //kotak ketujuh
                luas[2][28] = 1;
                luas[3][29] = 1;
                luas[3][28] = 1;
                luas[3][27] = 1;
                luas[3][25] = 1;
                luas[4][28] = 1;
                luas[4][27] = 1;
                luas[4][26] = 1;
                luas[4][25] = 1;
                luas[4][24] = 1;
                luas[5][27] = 1;
                luas[5][26] = 1;
                luas[5][25] = 1;
                luas[5][23] = 1;
                luas[6][27] = 1;
                luas[6][26] = 1;
                luas[6][25] = 1;
                luas[6][24] = 1;
                luas[6][23] = 1;
                luas[6][22] = 1;
                luas[7][26] = 1;
                luas[7][25] = 1;
                luas[7][23] = 1;
                luas[7][22] = 1;
                luas[8][25] = 1;
                int area_ketujuh = luas[2][28]+luas[3][29]+luas[3][28]+luas[3][27]+luas[3][25]+luas[4][28]+luas[4][27]+luas[4][26]
                +luas[4][25]+luas[4][24]+luas[5][27]+luas[5][26]+luas[5][25]+luas[5][23]+luas[6][27]+luas[6][26]+luas[6][25]
                +luas[6][24]+luas[6][23]+luas[6][22]+luas[7][26]+luas[7][25]+luas[7][23]+luas[7][22]+luas[8][25];
                
                //kotak kedelapan
                luas[8][19] = 1;
                luas[9][20] = 1;
                luas[10][20] = 1;
                luas[10][21] = 1;
                luas[10][22] = 1;
                luas[10][23] = 1;
                luas[10][24] = 1;
                luas[11][18] = 1;
                luas[11][19] = 1;
                luas[11][20] = 1;
                luas[11][23] = 1;
                luas[12][20] = 1;
                luas[12][21] = 1;
                luas[12][22] = 1;
                luas[12][23] = 1;
                luas[12][24] = 1;
                luas[12][25] = 1;
                luas[13][26] = 1;
                luas[13][23] = 1;
                luas[13][20] = 1;
                luas[13][19] = 1;
                luas[13][18] = 1;
                luas[13][17] = 1;
                luas[13][16] = 1;
                luas[14][20] = 1;
                luas[14][22] = 1;
                luas[15][13] = 1;
                luas[15][14] = 1;
                luas[15][15] = 1;
                luas[15][16] = 1;
                luas[15][17] = 1;
                luas[15][18] = 1;
                luas[15][19] = 1;
                luas[15][20] = 1;
                luas[15][21] = 1;
                luas[15][22] = 1;
                luas[15][23] = 1;
                luas[15][24] = 1;
                luas[15][25] = 1;
                luas[15][26] = 1;
                luas[15][27] = 1;
                luas[15][28] = 1;
                luas[16][18] = 1;
                luas[17][18] = 1;
                luas[18][18] = 1;
                luas[17][17] = 1;
                luas[16][22] = 1;
                luas[17][22] = 1;
                luas[18][22] = 1;
                luas[19][22] = 1;
                int area_terakhir = luas[8][19]+luas[9][20]+luas[10][20]+luas[10][21]+luas[10][22]+luas[10][23]+luas[10][24]+luas[11][18]
                +luas[11][19]+luas[11][20]+luas[11][23]+luas[12][20]+luas[12][21]+luas[12][22]+luas[12][23]+luas[12][24]+luas[12][25]+luas[13][26]
                +luas[13][23]+luas[13][20]+luas[13][19]+luas[13][18]+luas[13][17]+luas[13][16]+luas[14][20]+luas[14][22]+luas[15][13]+luas[15][14]
                +luas[15][15]+luas[15][16]+luas[15][17]+luas[15][18]+luas[15][19]+luas[15][20]+luas[15][21]+luas[15][22]+luas[15][23]+luas[15][24]
                +luas[15][25]+luas[15][26]+luas[15][27]+luas[15][28]+luas[16][18]+luas[17][18]+luas[18][18]+luas[17][17]+luas[16][22]+luas[17][22]
                +luas[18][22]+luas[19][22];
        
                
                System.out.println("Luas area 1 : "+area_pertama);
                System.out.println("Luas area 2 : "+area_kedua);
                System.out.println("Luas area 3 : "+area_ketiga);
                System.out.println("Luas area 4 : "+area_keempat);
                System.out.println("Luas area 5 : "+area_kelima);
                System.out.println("Luas area 6 : "+area_keenam);
                System.out.println("Luas area 7 : "+area_ketujuh);
                System.out.println("Luas area 8 : "+area_terakhir);
                
                System.out.println("Jadi Nilai Area Yang Paling Luas adalah : "+area_terakhir);
        
    }
    
}
