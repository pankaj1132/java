public class perfect_squrae_root {
    public static boolean check_perfect_square(int num) {
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {

                return true;
            }

        }

        return false;
    }

    public static void main(String[] arg) {

        System.out.println(check_perfect_square(37));
    }

}
