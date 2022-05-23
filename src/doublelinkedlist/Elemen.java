package doublelinkedlist;

/**
 *
 * @author jagu
 */
public class Elemen {
    Mahasiswa info;
    Elemen next;
    Elemen prev;
    
    public Elemen(String nama, int nim, double ipk){
        info = new Mahasiswa(nama, nim, ipk);
        next = null;
        prev = null;
    }
}
