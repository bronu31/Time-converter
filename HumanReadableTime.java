import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*public class Main {
    public static void main(String[] args) {
        int[][] arrr={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arrr));
    }*/

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, second);
    }
}

