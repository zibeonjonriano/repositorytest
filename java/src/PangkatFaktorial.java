import java.util.*;

public class PangkatFaktorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan bilangan utama (n): ");
        int n = scanner.nextInt();
        System.out.print("masukkan pemangkatan (m): ");
        int m = scanner.nextInt();

        //faktorial
        int hasilFaktorial = 1;
        int tempN = n;
        while (tempN>=1) {hasilFaktorial = hasilFaktorial * tempN;
                tempN = tempN -1;}

        //pangkat
        int hasilPangkat = 1;
        for (int i = 0  ; i < m;i++) {hasilPangkat = hasilPangkat*n;}

        System.out.println("n factorial = " + hasilFaktorial);
        System.out.println("n pangkat m = " + hasilPangkat);
    }
}
