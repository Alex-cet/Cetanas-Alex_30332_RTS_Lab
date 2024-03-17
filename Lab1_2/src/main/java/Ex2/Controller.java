package Ex2;

public class Controller {
    private Fir fir;

    public Controller(Fir fir) {
        this.fir = fir;
    }

    public void startProgress() {
        fir.run();
    }
}
