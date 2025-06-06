package ohgiraffers.section02.lopping;

public class Application {
    public static void main(String[] args) {
        A_for a = new A_for();
        a.testSimpleForStatement();
        a.testForExample1();
        a.testForExample2();
        a.testForExample3();
        a.printSimpleGugudan();

        A_nestedFor b = new A_nestedFor();
        b.printGugudanFromTwoToNine();
        b.printStarInputRowTimes();

        B_while c = new B_while();
        c.testSimpleWhileStatement();
        c.testWhileExample1();
        c.testWhileExample2();

        B_nestedWhile d = new B_nestedWhile();
        d.testWhileExample3();

        C_doWhile doWhile = new C_doWhile();
        doWhile.testSimpleDoWhileStatement();
        doWhile.testDoWhileExample();

    }
}
