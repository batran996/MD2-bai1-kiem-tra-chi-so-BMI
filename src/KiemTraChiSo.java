import java.util.Scanner;

public class KiemTraChiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.printf("Cùng tính BMI nhé :");
        System.out.printf("Hãy nhập cân nặng của bạn");
        weight = scanner.nextDouble();
        System.out.printf("Hãy nhập chiều cao của bạn");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5)
            System.out.printf("BMI là " + bmi + "gầy");

        if (bmi < 25)
            System.out.printf("BMI là " + bmi + "bình thường");

        if (bmi < 30)
            System.out.printf("BMI là " + bmi + "hơi mập");

        if (bmi >= 30)
            System.out.printf("BMI là " + "quá mập");


    }
}
