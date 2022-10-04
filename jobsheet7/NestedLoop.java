
package jobsheet7;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class NestedLoop {
    public static void main (String [] args){
        int baris,kolom  ,hasil_kali;
        int MAKS = 100;
        
        for (baris =1; baris <= MAKS; baris++)
        {
            for (kolom =1; kolom <=MAKS; kolom++){
            hasil_kali = baris * kolom;
            System.out.print("\t"+ hasil_kali);
              
            } 
        
       System.out.println("");
        }
    }
}
