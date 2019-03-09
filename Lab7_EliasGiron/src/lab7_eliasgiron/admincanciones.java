package lab7_eliasgiron;

import javax.swing.JProgressBar;

public class admincanciones extends Thread {

    private boolean avanzar;
    private JProgressBar progbar_t;
    private boolean vive;
    private int duracion;

    public admincanciones(JProgressBar progbar_t) {
        avanzar = true;
        this.progbar_t = progbar_t;
        vive = true;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getProgbar_t() {
        return progbar_t;
    }

    public void setProgbar_t(JProgressBar progbar_t) {
        this.progbar_t = progbar_t;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void run() {
        int cont = 1;
        while (vive) {
            
            if (avanzar && cont <= duracion) {
                progbar_t.setValue(cont);
                cont++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            

        }
    }

}
