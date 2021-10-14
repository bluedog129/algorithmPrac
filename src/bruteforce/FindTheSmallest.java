package bruteforce;

public class FindTheSmallest {
    public static void main(String[] args) {
        System.out.println(smallest(261236));
    }
    public static long[] smallest(long n) {
        int temp = 0;
        long[] result = new long[3];
        // string으로 변환
        String num = String.valueOf(n);
        // strarr에 나누어 num 문자열 저장
        String[] strArr = num.split("");
        int[] intArr = new int[strArr.length];

        for(int i = 0; i<intArr.length; i++) {
            // strArr의 내용을 intArr에 정수형으로 넣는다.
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        for(int i = 0; i<intArr.length; i++) {
            for(int j = 0; j<intArr.length; j++) {
                if(intArr[j] > intArr[i]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

        return result;
    }
}