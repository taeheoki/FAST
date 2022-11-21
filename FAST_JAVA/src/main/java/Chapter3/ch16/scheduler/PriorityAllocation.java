package Chapter3.ch16.scheduler;

public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("고객의 등급이 높은 고객의 상담 전화를 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("숙련도 높은 상담원에게 상담 업무가 배분됩니다.");
    }
}
