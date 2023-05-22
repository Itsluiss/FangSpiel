import GLOOP.*;


import javax.media.opengl.GL;

public class Kugel {

    public GLKugel kugel;
    private Box dieBox;
    private Spielfeld feld;

    private double radius;
    private boolean istAktiv;

    private Kugelfangen kugelfangen;

    int PunktX = (int) (Math.random() * 400) - (int) (Math.random() * 400);

    int PunktZ = (int) (Math.random() * 400) - (int) (Math.random() * 400);

    int q = (int) (Math.random() * 5) - (int) (Math.random() * 5);
    int w = (int) (Math.random() * 5) - (int) (Math.random() * 5);

    public Kugel(Box pBox) {
        kugel = new GLKugel(PunktX, 30, PunktZ, 20);
        kugel.setzeFarbe(7, 0, 0);
dieBox = pBox;
    }

    public void bewege() {

if(getroffen()){
    kugel.verschiebe(700000000,1000000,10000000);
}

        if (this.gibZ() < (-440) ||
                this.gibZ() > (440) ||
                this.gibX() < (-440) ||
                this.gibX() > (440)) {
        }
        else{
            kugel.verschiebe(q, 0, w);
        }

        if (this.gibZ() < (-420)||
                    this.gibZ() > (420)){
            w = -w;
        }
        if (this.gibX() < (-420)||
                this.gibX() > (420)){
            q = -q;
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


    public void drehe() {







    }

    public boolean getroffen() {
        double abstand = Math.sqrt(
                Math.pow(kugel.gibX() - dieBox.gibX(), 2) +
                        Math.pow(kugel.gibY() - dieBox.gibY(), 2) +
                        Math.pow(kugel.gibZ() - dieBox.gibZ(), 2)
        );
        if (abstand < 70) return true;
        else return false;

    }
}











