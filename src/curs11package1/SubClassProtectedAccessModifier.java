package curs11package1;

public class SubClassProtectedAccessModifier extends ProtectedAccessModifier{
  //sub class same package: yes
    public static void main(String[] args) {
       SubClassProtectedAccessModifier obj = new SubClassProtectedAccessModifier();
        obj.printMesaj();
    }
}
