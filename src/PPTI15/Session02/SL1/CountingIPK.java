package PPTI15.Session02.SL1;

public class CountingIPK {
    
    public static void sort(double ipk[]) {
        for (int i = 0; i < ipk.length; i++) {
            for (int j = i + 1; j < ipk.length; j++) {
                if (ipk[i] < ipk[j]) {
                    double temp = ipk[i];
                    ipk[i] = ipk[j];
                    ipk[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        double ipk[]= { 3.5, 3.9, 3.9, 3.2, 3.4, 3.6, 3.8, 3.1, 3.3, 3.0 };
        sort(ipk);
        for (int i = 0; i < ipk.length; i++) {
            for (int j = i + 1; j < ipk.length; j++) {
                if (ipk[i] < ipk[j]) {
                    double temp = ipk[i];
                    ipk[i] = ipk[j];
                    ipk[j] = temp;
                }
            }
        }

        for (int i = 0; i < ipk.length; i++) {
            int rank = 1;
            for (int j = 0; j < ipk.length; j++) {
                if (ipk[i] < ipk[j]) {
                    rank++;
                }
            }
            System.out.println(rank+" " + ipk[i] );            
        }
    }
}
