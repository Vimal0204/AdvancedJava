//Name : Vimal Kumar
// 20BCE10763
import add.sum;
import mul.mul;
import sub.minus;

public class Test {
    public static void main(String[] args) {
        sum s = new sum(3,5);
        System.out.println("The sum is : "+s.add());
        minus m = new minus(8,5);
        System.out.println("The subtraction  is : "+m.min());
        mul mul = new mul(3,5);
        System.out.println("The multiplication is : "+mul.cross());
    }
}