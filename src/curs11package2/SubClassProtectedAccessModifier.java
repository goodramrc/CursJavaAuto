package curs11package2;

import curs11package1.ProtectedAccessModifier;

public class SubClassProtectedAccessModifier extends ProtectedAccessModifier{
// sub class different package: yes
    public static void main(String[] args) {

        SubClassProtectedAccessModifier obj = new SubClassProtectedAccessModifier();
        obj.printMesaj();
    }
}
