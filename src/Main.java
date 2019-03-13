public class Main {

    public static void main(String[] args) {

        Lulu bLulu =new Lulu();
        Fiora rFiora =new Fiora();
        bLulu.showInfo();
        System.out.println();
        rFiora.showInfo();
        System.out.println();

        System.out.println("Lulu attack ");
        rFiora.hurt(bLulu.attack());
        bLulu.showInfo();
        System.out.println();
        rFiora.showInfo();
        System.out.println();

        System.out.println("Lulu use skillQ attack");
        System.out.println();
        rFiora.hurt(bLulu.skillQ());
        bLulu.showInfo();
        System.out.println();
        rFiora.showInfo();

    }
}
