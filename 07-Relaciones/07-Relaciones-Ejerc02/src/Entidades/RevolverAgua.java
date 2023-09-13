package Entidades;

public class RevolverAgua {
    
    private int posicAct;
    private int posicAgua;

    public RevolverAgua() {
    }

    public int getPosicAct() {
        return posicAct;
    }

    public void setPosicAct(int posicAct) {
        this.posicAct = posicAct;
    }

    public int getPosicAgua() {
        return posicAgua;
    }

    public void setPosicAgua(int posicAgua) {
        this.posicAgua = posicAgua;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicAct=" + posicAct + ", posicAgua=" + posicAgua + '}';
    }
}
