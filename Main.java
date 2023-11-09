import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	for(int i = 0; i < 2; i++) {
        String type = "";
        System.out.println("BMIを計算して、肥満度を表示します。");
        System.out.println("身長(m)を入力してください。");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("体重(kg)を入力してください。");
        double weight = Double.parseDouble(scanner.nextLine());

        double BMI = weight / (height * height);

        if (BMI < 18.5) {
            type = "やせ型";
        } else if
            (BMI < 25) {
            type = "標準体重";
        } else if
            (BMI < 30) {
            type = "肥満1度";
            } else if
        (BMI < 35) {
            type = "肥満2度";
        } else if
        (BMI < 40) {
            type = "肥満3度";
        } else if
        (BMI >= 40) {
            type = "肥満4度";
        }

            System.out.println("あなたのBMIは" + BMI + "です。");
            System.out.println("診断結果:" + type + "です。");
        }
    }

        }

