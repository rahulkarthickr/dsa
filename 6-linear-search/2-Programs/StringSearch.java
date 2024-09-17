public class StringSearch {
    public static void main(String[] args) {
        String name = "Rahul";
        char target = 'u';
        System.out.println(SearchString(name, target));
    }

    public static boolean SearchString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
