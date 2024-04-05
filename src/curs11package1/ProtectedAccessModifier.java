package curs11package1;

public class ProtectedAccessModifier {
  /*
  Scopul este in acelas pachet si sub clase din pachete diferite

  Clasele nu pot fi declarate ca protected

  Aceeasi clasa : yes
  Alta clasa din acelasi pachet : yes

  Subclasa (clasa copil) in acelas pachet : yes

  Sublasa in alt pachet : NO

  Alta clasa in alt pachet : NO

   */

   protected String mesaj = "Protected Access";

   protected void printMesaj() {
       System.out.println(mesaj);
   }

    public static void main(String[] args) {

       ProtectedAccessModifier obj = new ProtectedAccessModifier();
       obj.printMesaj();
    }

}
