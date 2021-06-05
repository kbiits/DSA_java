public class SegiEmpat {
    Titik p;
    Titik q;

    SegiEmpat(Titik p, Titik q) {
        this.p = p;
        this.q = q;
    }

    int getPanjang() {
        return this.q.x - this.p.x;
    }

    // Tinggi / Lebar
    int getLebar() {
        return this.q.y - this.p.y;
    }

    public static void main(String[] args) {
        Titik titik1 = new Titik(1,2);
        Titik titik2 = new Titik(2,2);
        SegiEmpat segiEmpat = new SegiEmpat(titik1, titik2);
        System.out.println("Panjang Segi Empat : " + segiEmpat.getPanjang());
        System.out.println("Lebar Segi Empat : " + segiEmpat.getLebar());
    }

}

/**
 * Titik
 */
class Titik {

    int x, y;

    Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
