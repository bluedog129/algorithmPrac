package bruteforce;

public class findTheParityOutlier {
    public static void main(String[] args) {
        int[] arr = {2, 6, 0, 100, 4, -3, 2602, 36};

        System.out.println(findOutlier(arr));
    }
    public static int findOutlier(int[] integers) {
        int oddCount = 0;
        for(int n : integers) {
            if(n%2 == 1 || n%2 == -1) {
                oddCount += 1;
            }
        }

        if (oddCount == 1) {
            for (int n : integers) {
                if(n%2 == 1 || n%2 == -1) {
                    return n;
                }
            }
        } else {
            for (int n : integers) {
                if(n%2 == 0) {
                    return n;
                }
            }
        }
        return 0;
    }
}
