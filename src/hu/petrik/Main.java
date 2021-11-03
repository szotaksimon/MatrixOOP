package hu.petrik;

public class Main {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        System.out.println("Négyzetes? : " + (m.isNegyzetes() ? "igen" : "nem"));
        System.out.println("A mátrix mérete: " + m.getSorokSzama() + " x " + m.getOszlopokSzama() + "\n");
        System.out.println(m);
    }
}
