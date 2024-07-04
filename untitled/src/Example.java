public class Example {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            //0으로 나누기를 시도합니다.
            System.out.println("결과: " + result);
            //이 줄은 실행되지 않습니다.

        } catch (ArithmeticException e) {
            // 문제가 발생하면 여기로 와서 실행됩니다.
            System.out.println("문제가 발생했어요: 0으로 나눌 수 없어요!");
            // 예외가 발생하면 출력되는 메시지입니다.
        }
        System.out.println("프로그램이 계속 실행됩니다.");
        //예외가 발생해도 이 줄은 실행됩니다.
    }
}