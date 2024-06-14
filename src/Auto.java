import java.lang.String;
public class Auto {
    private int cilindrata;

    private int cicicic;
    private String marca;
    private String targa;
   private String modello;

    public Auto(int cilindrata, String marca, String targa, String modello){
        this.cilindrata = cilindrata;
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public String getTarga() {
        return targa;
    }

    public String getModello() {
        return modello;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

}
