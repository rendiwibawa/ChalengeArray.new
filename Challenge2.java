package Chalenge2;
public class Challenge2 {
    public static void main(String[] args) {
         int nilai[] = new int [5];
        nilai[0] = 78;
        nilai[1] = 89;
        nilai[2] = 90;
        nilai[3] = 100;
        nilai[4] = 95;
        
        double ratarata = 0.0;
        for (int i=0; i<nilai.length; i++)ratarata+=nilai [i];
        ratarata/=nilai.length;
        System.out.println("Nilai rata-rata = "+ ratarata);
       
        if (ratarata > 90){
            System.out.println(" Rata-Rata Nilai anda buagus ");}
        if (ratarata < 90){
            System.out.println(" Rata-Rata Nilai anda lumayan  ");}
        else if (ratarata < 80){
            System.out.println(" Rata-Rata Nilai anda rendahh!!!!!! ");}
    }
    }
    

