package hu.petrik;

public class Main {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        System.out.println("Négyzetes? : " + (m.isNegyzetes() ? "igen" : "nem"));
        System.out.println("A mátrix mérete: " + m.getSorokSzama() + " x " + m.getOszlopokSzama() + "\n\n" + m);
        System.out.println("Elemek összege: " + m.elemekOsszege());
        System.out.println("Pozitív elemek száma: " + m.pozitivElemekDarabszama());
        System.out.println("Legnagyobb elem: " + m.legnagyobbElem());
    }
}
