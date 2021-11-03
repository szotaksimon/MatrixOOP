package hu.petrik;

public class NegyzetesMatrix extends Matrix {
    public NegyzetesMatrix(int sorokSzama) {
        super(sorokSzama, sorokSzama);
    }

    public NegyzetesMatrix(){
        this((int)(Math.random()*11)+5);
        this.feltolt();
    }

    //főátló összege
    public int foatloOsszege(){
        int osszeg = 0;
        for (int i = 0; i < this.matrix.length; i++){ //matrix.length() - sorok hossza
                                                        //matrix[0],length() . 0 . sor
            osszeg += matrix[i][i];
        }
        return osszeg;
    }

    public int mellekatloLegnagyobbOsszege(){
        int max = matrix[0][this.oszlopokSzama - 1];
        for (int i = 0; i < this.sorokSzama; i++) {
            if(max < matrix[i][(this.oszlopokSzama - 1) - i]){
                max = matrix[i][(this.oszlopokSzama - 1) - i];
            };
        }
        return max;
    }
}
