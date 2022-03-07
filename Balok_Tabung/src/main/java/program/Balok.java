
package program;


public class Balok extends PersegiPanjang implements MenghitungRuang{
    public double lpb, vlmb, tngb;

    @Override
    public void volume() {
        vlmb = pjp*lbp*tngb;
        System.out.println("Volume Balok = " + vlmb);
    }

    @Override
    public void luaspermukaan() {
        lpb = 2 * (pjp*lbp + pjp*tngb + lbp*tngb);
        System.out.println("Luas Permukaan Balok = " + lpb);
    }
    
    public void intngb(double tngb){this.tngb = tngb;}
}
