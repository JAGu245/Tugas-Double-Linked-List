package doublelinkedlist;

/**
 *
 * @author jagu
 */
public class DoubleLinkedList {
    Elemen first;
    
    DoubleLinkedList() {
        first = null;
    }
    
    void insertFirst(String nama, int nim, double ipk){
        Elemen new_elemen = new Elemen(nama, nim, ipk);
        if(first == null){
            first = new_elemen;
        }else{
            new_elemen.next = first;
            first.prev = new_elemen;
            first = new_elemen;
        }
    }
    
    void insertLast(String nama, int nim, double ipk){
        Elemen new_elemen = new Elemen(nama, nim, ipk);
        if(first == null){
            first = new_elemen;
        }else {
            Elemen temp = first;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new_elemen;
            new_elemen.prev = temp;
        }
    }
    
    void insertAt(String posisisetelah, String nama, int nim, double ipk){
        Elemen temp = first;
        
        Elemen new_elemen = new Elemen(nama,nim, ipk);
        if(temp == null){
            first = null;
        } else {
            while(temp.next != null){
                if(temp.info.nama == posisisetelah){
                    new_elemen.next = temp.next;
                    new_elemen.prev = temp;
                    temp.next = new_elemen;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
    }
    
    void deleteFirst(){
        if(first == null){
            System.out.println("LINK LIST KOSONG");
        }else {
            Elemen temp;
            temp = first.next;
            temp.prev = first;
            first = temp;
        }
    }
    
    void deleteAt(String nama){
        if(first == null){
            System.out.println("LINK LIST KOSONG");
        } else {
            Elemen temp = first;
            Elemen skip;
            while(temp.next  != null){
                if(temp.info.nama.equals(nama)){
                    skip = temp.prev.next.next;
                    temp = temp.prev;
                    temp.next = skip;
                    temp.prev = temp;
                }else{
                    temp = temp.next;
                }
            }
        }
    }
    
    void deleteLast(){
        Elemen temp = first;
        if(first == null){
            first = null;
        }else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }
    
    void print(){
        Elemen temp = first;
        if(temp == null){
            System.out.println("LINK LIST KOSONG");
        } else {
            while (temp != null){
                System.out.println("Nama : "+ temp.info.nama);
                System.out.println("NIM  : "+ temp.info.nim);
                System.out.println("IPK  : "+ temp.info.ipk);
                System.out.println("");
                temp = temp.next;
            }
        }
    }
    
}
