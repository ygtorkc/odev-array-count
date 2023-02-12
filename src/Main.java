import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz");
        int boyut = input.nextInt();
        int[] arrr = new int[boyut];
        System.out.println("Dizideki elemanları giriniz:");
        for (int i = 0; i < boyut; i++) {
            arrr[i] = input.nextInt();
        }
         int[] frekans = new int[boyut];
        int count;
        for (int i=0 ; i< boyut ; i++){
            count = 1;
            for(int j=i+1; j<boyut ; j++){
                if(arrr[i]== arrr[j]){
                    count++;
                    frekans[j]=-1;
                }
                if(frekans[i] != -1){
                    frekans[i]=count;
                }

            }


        }

    System.out.println("Dizinin frekansı:");
        for(int i=0; i<boyut;i++){
            if(frekans[i] != -1) {
                System.out.println(arrr[i] + ": " + frekans[i]);
            }
        }

    }
}