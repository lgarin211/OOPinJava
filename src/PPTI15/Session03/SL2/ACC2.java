    package PPTI15.Session03.SL2;
    import java.util.*;

    public class ACC2 {

        public static void main(String[] args) {
            case1NullPointerException();
        }    
        // NullPointerException adalah keluhan (exception) yang ditemukan dalam pemrograman Java ketika program mencoba mengakses atau menggunakan objek yang tidak memiliki nilai (null). Hal ini terjadi karena objek yang digunakan tidak diinisialisasi atau tidak memiliki referensi. Contoh kode yang menyebabkan NullPointerException adalah sebagai berikut:
        static void case1NullPointerException(){
            String text;
            System.out.println(text.length());
        }

        // NumberFormatException adalah keluhan (exception) yang ditemukan dalam pemrograman Java ketika program mencoba mengubah atau mengonversi string ke tipe numerik seperti int, float, atau double, namun string yang diberikan tidak dapat diformat ke dalam tipe numerik tersebut. Hal ini terjadi karena string yang diberikan tidak sesuai dengan format yang diharapkan.Contoh kode yang menyebabkan NumberFormatException adalah sebagai berikut:
        static void case2NumberFormatException(){
            String str="abc";
            int a=Integer.parseInt(str);
        }
        //  IllegalArgumentException, yang terjadi ketika argumen yang diberikan tidak sesuai dengan yang diharapkan oleh method.
        static void case3IllegalArgumentException(){
            int size = -5;
            if (size < 0) {
                throw new IllegalArgumentException("Size must be greater than or equal to 0");
            }
        }
        
        // RuntimeException, yang terjadi ketika ada kesalahan pada saat program dijalankan.
        static void case4RuntimeException() {
            String[] arr = new String[3];
            String s = arr[3];
        }
        // IllegalStateException, yang terjadi ketika method dipanggil dalam kondisi yang tidak sesuai dengan keadaan yang diharapkan.
        static void case5IllegalStateException() {
            ArrayList<Integer> numbers = new ArrayList<>();
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                Integer number = iterator.next();
                if (number > 5) {
                    iterator.remove();
                }
            }
        }
        // NoSuchMethodException, yang terjadi ketika method yang dicari tidak ditemukan.
        static void case6NoSuchMethodException() {
            Class<ACC2> cls = ACC2.class;
            Method method = cls.getMethod("exampleMethod", null);
        }

        // ClassCastException, yang terjadi ketika objek tidak dapat dikonversi ke tipe yang diharapkan.
        static void case7ClassCastException() {
            Object obj = new Integer(5);
            String str = (String) obj;
        }
        
        // Exception, yang terjadi ketika terjadi kesalahan pada saat program dijalankan. Dalam contoh ini, Exception terjadi ketika program mencoba untuk melakukan pembagian dengan nol.
        static void case8Exception() {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        // ParseException, yang terjadi ketika program mencoba untuk mengubah string ke tipe tanggal namun string tidak sesuai dengan format yang diharapkan.
        static void case9ParseException() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            try {
                Date date = dateFormat.parse("2022-12-31");
            } catch (ParseException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        //  InvocationTargetException, yang terjadi ketika method yang dijalankan menimbulkan exception.
        static void case10InvocationTargetException() {
            try {
                Class<ACC2> cls = ACC2.class;
                Method method = cls.getMethod("exampleMethod", null);
                method.invoke(null, null);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        

    }