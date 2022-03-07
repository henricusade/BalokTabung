
package program;


public class PersegiPanjang implements MenghitungBidang{
public double pjp, lbp, luasp, kllp;
@Override
    public void keliling() {
        kllp = 2*(pjp+lbp);
        System.out.println("Keliling Persegi Panjang = " + kllp);
    }

@Override
    public void luas() {
        luasp = pjp*lbp;
        System.out.println("Luas Persegi Panjang = " + luasp);
    }
    
    public void inpjp(double pjp){this.pjp = pjp;}
    public void inlbp(double lbp){this.lbp = lbp;}
}
