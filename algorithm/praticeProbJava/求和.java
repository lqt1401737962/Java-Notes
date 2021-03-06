package day01;

//给出两个整数 a 和 b , 求他们的和。
public class 求和 {
    public static void main(String[] args) {
        求和 求和 = new 求和();
        System.out.println(求和.add(12, 33));
        System.out.println(求和.aplusb(22, 66));
        ;
        int a = 4;
        int b = 5;
        System.out.println(a & b);
    }

    //方法一
    public int add(int a, int b) {

        return a + b;
    }

    //方法二
    // 主要利用异或运算来完成
    // 异或运算有一个别名叫做：不进位加法
    // 那么a ^ b就是a和b相加之后，该进位的地方不进位的结果
    // 然后下面考虑哪些地方要进位，自然是a和b里都是1的地方
    // a & b就是a和b里都是1的那些位置，a & b << 1 就是进位
    // 之后的结果。所以：a + b = (a ^ b) + (a & b << 1)
    // 令a' = a ^ b, b' = (a & b) << 1
    // 可以知道，这个过程是在模拟加法的运算过程，进位不可能
    // 一直持续，所以b最终会变为0。因此重复做上述操作就可以
    // 求得a + b的值。
    public int aplusb(int a, int b) {
        while (b != 0) {
            int _a = a ^ b;
            int _b = (a & b) << 1;
            a = _a;
            b = _b;
        }
        return a;
    }
}
