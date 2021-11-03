package hu.petrik;

public class Matrix {
    private int sorokSzama;
    private int oszlopokSzama;
    private int[][] matrix;

    public Matrix(int sorokSzama, int oszlopokSzama){
        this.sorokSzama = sorokSzama;
        this.oszlopokSzama = oszlopokSzama;
        this.matrix = new int[sorokSzama][oszlopokSzama];
    }

    public  Matrix(){
        this.sorokSzama = (int)(Math.random()*11)+5;
        this.oszlopokSzama = (int)(Math.random()*11)+5;
        this.matrix = new int[this.sorokSzama][this.oszlopokSzama];
        for(int i = 0; i < this.sorokSzama; i++){
            for (int j = 0; j < oszlopokSzama; j ++){
                this.matrix[i][j] = (int)(Math.random()* 90)+ 10;
            }
        }
    }
    //döntsük el, hogy négyzetes mátrix-e a mátrixunk
    public boolean isNegyzetes(){
        return this.sorokSzama == this.oszlopokSzama;
    }

    public int getSorokSzama() {
        return sorokSzama;
    }

    public int getOszlopokSzama() {
        return oszlopokSzama;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.sorokSzama; i++){ //i hivatkozik a sorokra
            for (int j = 0; j < this.oszlopokSzama; j++){ //j hivatkozik az oszlopokra
                s += matrix[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}
