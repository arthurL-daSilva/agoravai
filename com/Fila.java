package com;

public class Fila {

    private static Fila instance;
    

    public static Fila getInstance() {
        if(instance == null){
            instance = new Fila();
        }

        return instance;
    }

    private void ImprimeDocumento(){
        System.out.println("Imprimindo documento.");
    }

    private void RemoveDocumento(){
        System.out.println("Removendo documento.");
    }

    private void RemoveTodosDocumentos(){
        System.out.println("Revomendo todos os documentos.");
    }
}