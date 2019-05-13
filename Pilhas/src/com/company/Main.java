package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }


    static void metodo1(){
        System.out.println("Inicio metodo 1");
        try{
            metodo2();

        }catch (Exception e){
            System.out.println("Excecao no 1");
            System.out.println(e);
        }
        finally {
            System.out.println("Depois do catch 1");
        }


        System.out.println("Fim todo 1");
    }

    static void metodo2() throws ArrayIndexOutOfBoundsException{
        System.out.println("Inicio metodo 2");
        int[] array = new int[10];
        for (int i = 0; i<=15;i++){
            try{
                array[i]=i;
                System.out.println(i);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("deu merda");
                    System.out.println(e);
                    throw e;
                }
                finally {
                System.out.println("Depois do try catch 2");
            }
        }
        System.out.println("Fim método 2");
    }
//    static void metodo2(){
//        System.out.println("Inicio metodo 2");
//        int[] array = new int[10];
//        for (int i = 0; i<=15;i++){
//            array[i]=i;
//            System.out.println(i);
//            }
//        System.out.println("Deu ruim");
//    }
//    static void metodo2(){
//        System.out.println("Inicio metodo 2");
//        int[] array = new int[10];
//        try {
//            for (int i = 0; i<=15;i++){
//                array[i]=i;
//                System.out.println(i);
//            }
//
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Deu merda");
//            System.out.println(e);
//        }
//        System.out.println("Fim método 2");
//    }
}
