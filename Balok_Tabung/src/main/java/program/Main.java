
package program;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
    Scanner Input = new Scanner(System.in);
    Balok blk = new Balok();
    Tabung tbg = new Tabung();
    int temp;
    
    do{
            System.out.print("\n===========\nMenu Utama\n===========");
            System.out.print("\n1. Hitung Balok\n2. Hitung Tabung\n0. Exit\nPilih: "); 
            int pil = Input.nextInt(); 
            
            switch (pil){
                case 1: System.out.print("Input Panjang : ");
                        double pjp = Input.nextDouble(); blk.inpjp(pjp);
                        
                        System.out.print("Input Lebar   : ");
                        double lbp = Input.nextDouble(); blk.inlbp(lbp);
                        
                        System.out.print("Input Tinggi  : ");
                        double tngb = Input.nextDouble(); blk.intngb(tngb);
                        
                        blk.luas();
                        blk.keliling();
                        blk.volume();
                        blk.luaspermukaan();
                        
                        break;
                
                case 2: System.out.print("Input Tinggi      : ");
                        double tngt = Input.nextDouble(); tbg.intngt(tngt);
                        
                        System.out.print("Input Jari - jari : ");
                        double rl = Input.nextDouble(); tbg.inRl(rl);

                        tbg.luas();
                        tbg.keliling();
                        tbg.volume();
                        tbg.luaspermukaan();
                        break;
                
                case 0: ; break;
                default : System.out.print("\n Opsi yang anda masukkan tidak tersedia\n");
            }
        
            System.out.print("Ulangi ? (Ya: 1 || Tidak: 0) ");
            pil = Input.nextInt();
            temp = pil;
            
        }while(temp !=0);
    
}
}
