import GLOOP.*;


import javax.media.opengl.GL;

public class Kugel {

    public GLKugel kugel;
    private Box dieBox;
    private Spielfeld feld;

    private double radius;
    private boolean istAktiv;
    private double vX, vZ;
    private Kugelfangen kugelfangen;


    public Kugel() {
        kugel = new GLKugel(0, 30, 0, 20);

        kugel.setzeFarbe(2, 0, 9);

    }

    public void bewege() {
        int q = (int) (Math.random() * 10);
        int w = (int) (Math.random() * 10);
        kugel.verschiebe(q, 0, w);

        if (this.gibZ() < (-425)) {

            kugel.verschiebe(-q, 0, -w);
        }

        if (this.gibZ() > (425)) {

        kugel.verschiebe(-q, 0, -w);
    }

            if (this.gibX() < (-425)) {

                kugel.verschiebe(-q, 0,-w);
            }

            if (this.gibX() > (425)) {

                kugel.verschiebe(-q, 0, -w);
            }
}





    public double gibX() {
        return kugel.gibX();
    }

    public double gibY() {
        return kugel.gibY();
    }

    public double gibZ() {
        return kugel.gibZ();
    }
}






