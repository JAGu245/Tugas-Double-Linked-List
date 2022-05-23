package doublelinkedlist;

/**
 *
 * @author jagu
 */
public class Mahasiswa {
    int nim;
    double ipk;
    String nama;
    Mahasiswa next = null;
    Mahasiswa prev = null;
    
    Mahasiswa(String nama, int nim, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
}
