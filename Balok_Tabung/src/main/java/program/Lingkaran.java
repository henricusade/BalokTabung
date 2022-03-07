
package program;


public class Lingkaran implements MenghitungBidang {
    public double rl, klll, luasl;
    
    @Override
    public void keliling(){
        klll = 2*3.14*rl;
        System.out.println("Keliling Lingkaran = " + klll);
    }
    @Override
    public void luas(){
        luasl = 3.14*rl*rl;
        System.out.println("Luas Lingkaran = " + luasl);
    }
    
    public void inRl(double rl){ this.rl = rl;}
}
