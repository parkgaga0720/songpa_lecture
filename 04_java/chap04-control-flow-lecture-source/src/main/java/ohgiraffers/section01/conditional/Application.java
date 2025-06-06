package ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a = new A_if();
        a.testSimpleIfStatement();
        a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
        b.testSimpleIfElseStatement();
        b.testNestedIfElseStatement();

        C_ifElseIF c = new C_ifElseIF();
        c.testSimpleIfElseIfStatement();
        c.testNestedIfElseIfStatement();

        D_switch d = new D_switch();
        d.testSimpleSwitchStatement();
        d.testSwitchVendingMachine();
    }
}
