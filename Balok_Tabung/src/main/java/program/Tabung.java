
package program;


public class Tabung extends Lingkaran implements MenghitungRuang{
    public double lpt, vlmt, tngt;

    @Override
    public void volume() {
        vlmt = 3.14*rl*rl*tngt;
        System.out.println("Volume Tabung = " + vlmt);
    }

    @Override
    public void luaspermukaan() {
       lpt = 2*3.14*rl*(rl+tngt);
       System.out.println("Luas Permukaan Tabung = " + lpt);
    }
    
    public void intngt(double tngt){this.tngt = tngt;}
}
