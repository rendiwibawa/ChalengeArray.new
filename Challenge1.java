
package Chalenge1;

public class Challenge1 {

    String hp[][]     = {{"082142004434"},    {"085736041408"},       {"082331381865"}, {"085646360500"},          {"081243294691"},                 {"082241831307"},          {"085334783095"},                      {"081359418005"},                           {"081333836654"},                   {"081555858321"}};
    String nama[][]   = {{"Naisya Najmi"}, {"Memoreza Sabana"}, {"Sabrina Amelia R.P"}, {"arfina devi maulidah"},{"In'amy Fadlyyah Takariyanti"}, {"Fatan Virgian Nova"},        {"Kevin Arullah Herdiansyah"},      {"muhammad satrio ajinoto"}, {"yeremia rizky paramasatya"},            {"lukas erwindo septasona"}};
    String alamat[][] = { {"Tulungagung"},               {"2"},        {"Tulungagung"}, {"jombang"},            {"Tuban"},                       {"Madiun"},                        {"JL.D.Paniai terusan II H7A22"},       {"griyashanta c 215"},          {"pandanwangi royal park blok c no 5"}, {"kediri"}};
    String hoby[][]   = { {"Menyanyi"}   ,          {"Galih "},            {"Tidur"}, {"olahraga"},           {"Tidur"},                       {"Sepak Bola,  Basket, Main game"},{"Baca buku, main game"},           {"tidur"},                          {"tidur,main game"},                            {"menggambar dan tidur"}};
    String ig[][]     = {  {"naisya.ca"} ,         {"memorezzas"},        {"sabrinampan"}, {"arfinadevi_"},        {"@amytaakrynti"},                  {"fatan_nova"},                     {"tio_arullah"},{""},           {"mhsatrioa"},                      {"yeremia_rizky"},                          {"zefta._"}};
 
    public void tampil(String n) {
        System.out.println("=====Identitas Siswa Angkatan 28 RPL_2======="+"\n");
    }

    public void namahp(int n) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("nama     :"+nama[5][j]+"\n" + "nomer hp :"+ hp[5][j]+"\n"+"alamat   :"+alamat [5][j]+"\n"+"Hobby    :"+hoby[5][j]+"\n"+"Ig       :"+ig [5][j]+"\n");
                 System.out.println("nama     :"+nama[9][j]+"\n" + "nomer hp :"+ hp[9][j]+"\n"+"alamat   :"+alamat [9][j]+"\n"+"Hobby    :"+hoby[9][j]+"\n"+"Ig       :"+ig [9][j]);    
               
            }    
        }
    }

    public static void main(String[] args) {
        Challenge1 siswa = new Challenge1();
        siswa.tampil(null);
        siswa.namahp(0);
        System.out.println();    }
}
