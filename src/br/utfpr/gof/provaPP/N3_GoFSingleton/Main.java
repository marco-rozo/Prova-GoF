package br.utfpr.gof.provaPP.N3_GoFSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n===============================");
        System.out.println("Primeiro Round");
        System.out.println("===============================\n");
        CenarioMarcoAntonioSingleton.getInstance().detalhamento("A");

        System.out.println("\n\n===============================");
        System.out.println("Segundo Round");
        System.out.println("===============================\n");
        CenarioMarcoAntonioSingleton.getInstance().detalhamento("B");

        System.out.println("\n\n===============================");
        System.out.println("Terceiro Round");
        System.out.println("===============================\n");
        CenarioMarcoAntonioSingleton.getInstance().detalhamento("RUSH");

        System.out.println("\n\n===============================");
        System.out.println("Quarto Round");
        System.out.println("===============================\n");
        CenarioMarcoAntonioSingleton.getInstance().detalhamento("A");
    }
}
