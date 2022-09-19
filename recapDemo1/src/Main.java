public class Main {
    public static void main(String[] args){
        int sayi1=2;
        int sayi2=120;
        int sayi3=500;
        if (sayi1>sayi2){
            if (sayi1>sayi3){
                System.out.println("en büyük sayi:"+sayi1);
            }

        } else if (sayi2>sayi3) {
            System.out.println("en büyük sayi:"+sayi2);
        }
        else {
            System.out.println("en büyük sayi:" + sayi3);
        }
    }
}