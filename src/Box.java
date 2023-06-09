
import GLOOP.*;

public class Box{
    private GLQuader quader;
    private Spielfeld feld;
    private double vX,vZ;
    private double breite, tiefe;

    public Box() {
        quader = new GLQuader(0,0,0,50,50,50);
        quader.setzePosition(0,35,0);
        quader.setzeFarbe(0,0,2);

    }
    public void bewegeOben(){
        if(this.gibZ()<(-425)){
        }
        else{
            quader.verschiebe(0,0,-1);

        }
    }


    public void bewegeUnten(){
        if(this.gibZ()>(425)){
        }
        else{
            quader.verschiebe(0,0,1);

        }
    }

    public void bewegeLinks(){
        if(this.gibX()<(-425)){
        }
        else{
            quader.verschiebe(-1,0,0);

        }
    }

    public void bewegeRechts(){
        if(this.gibX()>(425)){
        }
        else{
            quader.verschiebe(1,0,0);

        }
    }

    public double gibX(){
        return quader.gibX();}

    public double gibY(){
        return quader.gibY();}

    public double gibZ(){
        return quader.gibZ();}
}