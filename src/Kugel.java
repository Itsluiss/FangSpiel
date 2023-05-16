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

    int PunktX = (int) (Math.random() * 400) - (int) (Math.random() * 400);

    int PunktZ = (int) (Math.random() * 400) - (int) (Math.random() * 400);

    int q = (int) (Math.random() * 10) - (int) (Math.random() * 10);
    int w = (int) (Math.random() * 10) - (int) (Math.random() * 10);

    public Kugel() {
        kugel = new GLKugel(PunktX, 30, PunktZ, 20);
        kugel.setzeFarbe(7, 0, 0);

    }

    public void bewege() {

        kugel.verschiebe(q, 0, w);

        if (this.gibZ() < (-425)) {

            kugel.verschiebe(-q, 0, -w);
        }

        if (this.gibZ() > (425)) {

            kugel.verschiebe(-q, 0, -w);
        }

        if (this.gibX() < (-425)) {

            kugel.verschiebe(-q, 0, -w);
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


    private boolean getroffen() {
        double abstand = Math.sqrt(
                Math.pow(kugel.gibX() - dieBox.gibX(), 2) +
                        Math.pow(kugel.gibY() - dieBox.gibY(), 2) +
                        Math.pow(kugel.gibZ() - dieBox.gibZ(), 2)
        );
        if (abstand < 70) return true;
        else return false;

    }


    public void Despawn(){
        if(this.getroffen())kugel.setzeSichtbarkeit(false);



    }
}











