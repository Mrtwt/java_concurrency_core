package threadcoreknowledge.sixstates;

/**
 * @Description 测试线程sleep是什么状态
 * @Author twt
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/16
 */
public class SleepStateTest implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        SleepStateTest task = new SleepStateTest();
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(1000);
        System.out.println("sleep固定时间时线程状态" + thread.getState());
    }

    @Override
    public void run() {
        try {
            System.out.println("task is executed");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
