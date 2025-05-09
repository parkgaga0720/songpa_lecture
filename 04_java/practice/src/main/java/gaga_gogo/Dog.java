package gaga_gogo;

public class Dog {

    private String state = "Standing";
    private int speed = 0;

    // 앉기
    public void sitting() {
        if (state.equals("Sitting")) {
            System.out.println("고고는 이미 앉아있습니다.");
        } else if (state.equals("Walking")) {
            System.out.println("고고는 산책 중이라 앉아있기 싫습니다.");
        } else {
            state = "Sitting";
            System.out.println("고고가 앉아서 쳐다봅니다");
        }
    }

    // 기다리기
    public void waiting() {
        if (state.equals("Sitting")) {
            state = "Waiting";
            System.out.println("고고가 기다리고 있습니다.");
        } else if (state.equals("Walking") || state.equals("Running")) {
            System.out.println("고고는 산책 중이라 기다릴 수 없습니다.");
        } else {
            System.out.println("고고는 먼저 앉아야 기다릴 수 있습니다.");
        }
    }

    // 먹기
    public void eating() {
        if (state.equals("Waiting")) {
            state = "Eating";
            System.out.println("고고가 칭찬으로 간식을 먹습니다.");
        } else if (state.equals("Eating")) {
            System.out.println("고고는 이미 간식을 먹고 있습니다.");
        } else {
            System.out.println("고고에게 간식을 줄 수 없습니다.");
        }
    }

    // 산책 시작
    public void happy() {
        if (state.equals("Waiting") || state.equals("Sitting") || state.equals("Eating")) {
            state = "Walking";
            speed = 1; // 산책 시작 시 기본 속도
            System.out.println("고고가 산책을 나와서 신났습니다!");
        } else if (state.equals("Walking")) {
            System.out.println("고고는 이미 산책 중입니다.");
        } else {
            System.out.println("고고는 집에서 다른 훈련을 먼저 해야 합니다.");
        }
    }

    // 뛰기
    public void running() {
        if (state.equals("Walking") || state.equals("Running")) {
            state = "Running";
            speed++; // 뛰기 상태에서는 속도가 증가
            System.out.println("고고가 신나게 뛰고 있습니다! 속도: " + speed);
        } else {
            System.out.println("고고는 산책 중일 때만 뛰어야 합니다.");
        }
    }

    // 집에 가기
    public void sad() {
        if (state.equals("Walking")) {
            state = "Standing";
            System.out.println("고고가 집에 돌아와서 시무룩해합니다.");
        } else {
            System.out.println("고고는 집에 있습니다.");
        }
    }


    public boolean isStanding() {
        return state.equals("Standing");
    }

    public boolean isWalking() {
        return state.equals("Walking");
    }

    public boolean isRunning() {
        return state.equals("Running");
    }

    public boolean isSitting() {
        return state.equals("Sitting");
    }

    public boolean isWaiting() {
        return state.equals("Waiting");
    }
}
