package gaga_gogo;

public class Owner {

    private final Dog gogo = new Dog();

    public void gogoSit() {
        if (gogo.isStanding()){
            gogo.sitting();
        }
        System.out.println("고고는 지금 앉을 수 없습니다.");
        return;
    }

    public void gogoWait() {
        gogo.waiting();
    }

    public void gogoEat() {
        gogo.eating();
    }

    public void gogoWalk() {
        gogo.happy();
    }

    public void gogoRun() {
        gogo.running();
    }

    public void gogoHome() {
        gogo.sad();
    }
}
