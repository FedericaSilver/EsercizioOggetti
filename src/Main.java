//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Auto auto1 = new Auto(300, "Opel", "CN897ZN", "Corsa");
    stampaInfo(auto1);
    auto1.setTarga("NY789XI");
    stampaInfo(auto1);
        }
        public static void stampaInfo(Auto auto){
            System.out.println("La targa della macchina è " + auto.getTarga());
            System.out.println("La cilindrata dell'auto è " + auto.getCilindrata());
            System.out.println("La marca dell'auto è " + auto.getMarca());
            System.out.println("Il modello dell'auto è " + auto.getModello());

        }
    }
