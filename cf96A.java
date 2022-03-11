import java.util.*;
public class cf96A {

    public static boolean isSame(int[] arr, int start, int end) {
        int t = arr[start];
        for(int i=start+1; i<=end; i++) {
            if (t != arr[i]) return false;
        }
        return true;
    }

    public static boolean checkFootballDanger(String s) {
        int[] arr = new int[s.length()];
        for (int i=0; i<s.length(); i++) arr[i] = Character.getNumericValue(s.charAt(i));
        int start = 0;

        for (int end=0;end<arr.length; end++) {
            if (end - start + 1 == 7) {
                if (isSame(arr, start, end)) return true;
                else start++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        if (checkFootballDanger(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}