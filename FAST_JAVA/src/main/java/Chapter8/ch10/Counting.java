package Chapter8.ch10;

public class Counting {
    public static void main(String[] args) {
        int[] people = {50, 40, 27, 99, 76, 81, 29, 31, 33, 62};
        int[] ages = new int[10];   // 연령대에 따른 수 세기

        for (int i = 0; i < people.length; i++) {
            int age = people[i];
            if (age < 10)
                ages[0]++;
            else if (age < 20)
                ages[1]++;
            else if (age < 30)
                ages[2]++;
            else if (age < 40)
                ages[3]++;
            else if (age < 50)
                ages[4]++;
            else if (age < 60)
                ages[5]++;
            else if (age < 70)
                ages[6]++;
            else if (age < 80)
                ages[7]++;
            else if (age < 90)
                ages[8]++;
            else
                ages[9]++;
        }

        int number = people.length;
        System.out.println(number + "명 중 10대 미만은 " + ages[0] + "명 입니다.");
        System.out.println(number + "명 중 10대는 " + ages[1] + "명 입니다.");
        System.out.println(number + "명 중 20대는 " + ages[2] + "명 입니다.");
        System.out.println(number + "명 중 30대는 " + ages[3] + "명 입니다.");
        System.out.println(number + "명 중 40대는 " + ages[4] + "명 입니다.");
        System.out.println(number + "명 중 50대는 " + ages[5] + "명 입니다.");
        System.out.println(number + "명 중 60대는 " + ages[6] + "명 입니다.");
        System.out.println(number + "명 중 70대는 " + ages[7] + "명 입니다.");
        System.out.println(number + "명 중 80대는 " + ages[8] + "명 입니다.");
        System.out.println(number + "명 중 90대는 " + ages[9] + "명 입니다.");
    }
}
