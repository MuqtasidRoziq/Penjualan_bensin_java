import java.util.ArrayList;
import java.util.Random;

public class PenjualanBensin {
    public static void main(String[] args) {
        int Pertalite = 2000;
        int Pertamax = 2500;
        int PertamaxTurbo = 1700;
        int Pertadex = 2800;
        ArrayList<Integer> PenjualanPertalite = new ArrayList<>();
        ArrayList<Integer> PenjualanPertamax = new ArrayList<>();
        ArrayList<Integer> PenjualanPertamaxTurbo = new ArrayList<>();
        ArrayList<Integer> PenjualanPertadex = new ArrayList<>();
        for (int index = 0; index <3; index++) {
            int PenjualanPertaliteRandom = new Random().nextInt(Pertalite);
            PenjualanPertalite.add(PenjualanPertaliteRandom);
            int PenjualanPertamaxRandom = new Random().nextInt(Pertamax);
            PenjualanPertamax.add(PenjualanPertamaxRandom);
            int PenjualanPertamaxTurboRandom = new Random().nextInt(PertamaxTurbo);
            PenjualanPertamaxTurbo.add(PenjualanPertamaxTurboRandom);
            int PenjualanPertadexRandom = new Random().nextInt(Pertadex);
            PenjualanPertadex.add(PenjualanPertadexRandom);

            System.out.println("Penjualan Pertalite ke-" + (index + 1) + "=" + PenjualanPertaliteRandom);
            System.out.println("Penjualan Pertamax ke-" + (index + 1) + " = " + PenjualanPertamaxRandom);
            System.out.println("Penjualan Pertamax Turbo ke-" + (index + 1) + "=" + PenjualanPertamaxTurboRandom);
            System.out.println("Penjualan Pertadex ke-" + (index + 1) + "=" + PenjualanPertadexRandom);

            System.out.println("Sisa Penjualan Pertalite = " + (Pertalite - PenjualanPertaliteRandom));
            System.out.println("Sisa Penjualan Pertamax = " + (Pertamax - PenjualanPertamaxRandom));
            System.out.println("Sisa Penjualan Pertamax Turbo = " + (PertamaxTurbo - PenjualanPertamaxTurboRandom));
            System.out.println("Sisa Penjualan Pertadex = " + (Pertadex - PenjualanPertadexRandom));

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            System.out.println("Total Penjualan Pertalite = " + PenjualanPertalite.stream().mapToInt(i -> i).sum());
            System.out.println("Total Penjualan Pertamax =" + PenjualanPertamax.stream().mapToInt(i -> i).sum());
            System.out.println("Total Penjualan Pertamax Turbo =" + PenjualanPertamaxTurbo.stream().mapToInt(i -> i).sum());
            System.out.println("Total Penjualan Pertadex =" + PenjualanPertadex.stream().mapToInt(i -> i).sum());

    }
}
