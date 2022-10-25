public class Bai3 {
    public static void main(String[] args) {
        // trâu : 100 con
        // cỏ : 100 bó
        // đứng ăn 5
        // nằm ăn 3
        // già: 3 con ăn 1 bó

        for (int dung = 1; dung <= 20; dung++) {
            for (int nam = 1; nam <= 33; nam++) {
                int gia = 100 - dung - nam;
                if (gia % 3 != 0) continue;

                if ((dung * 5 + nam * 3 + (gia * 1 / 3)) == 100) {
                    System.out.println(dung + " " + nam + " " + gia);
                }
            }
        }
    }
}
