import java.util.Scanner;

public class PemilihanHari09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayNama, dayType;
        System.out.print("Input nama hari: ");
        dayNama = sc.nextLine();

        switch (dayNama.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "Weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "Weekend";
                break;
            default:
                dayType = "invalid day name";
        }

        System.out.println(dayNama + " is a " + dayType);
    }
}
