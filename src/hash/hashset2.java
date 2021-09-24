package hash;
// List는 순서를 유지하고 중복을 허용한다.
// hashset은 순서유지를 하지 않으며 중복을 허용하지 않는다.
// 순서를 유지하려면 LinkedHashSet클래스를 사용하면 된다.
import java.util.HashSet;

public class hashset2 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("lemur");
        h.add("orangatang");
        h.add("spider monkey");
        h.add("lemur");
        h.add("orangatang");

        System.out.println(h);
    }
}
