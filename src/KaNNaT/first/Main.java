package KaNNaT.first;

public class Main {

    private static int reportfriday;

    public static void main(String[] args) {
	// Task # 1
        int k = 1;
        while (k <= 10) {
            System.out.print(k++);
        }
        System.out.print("\n");

        for (int d = 10; d > 0; d--) {
            System.out.print(d);
        }
        System.out.print("\n");

    // Task # 2
        int firstFriday = 1;
        for (int firstfriday = 1; firstfriday <= 31; firstfriday = firstfriday + 7) {
            System.out.println("Сегодня пятница " + firstfriday + "-е число. Необходимо подготовить отчет.");
        }

    // Task # 3
        for (int comet = 0; comet <= 2022; comet = comet + 79) {
            if (comet > 1822)
            System.out.println(comet);
        }

    }
}
