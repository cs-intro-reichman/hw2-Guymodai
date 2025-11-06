public class TimeCalc {
    public static void main(String[] args) {
        int hoursToAdd = 0;
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd  = Integer.parseInt(args[1]);

        while (minutesToAdd >= 60) {
            minutesToAdd -= 60;
            hoursToAdd++;
        }

        if (minutes + minutesToAdd >= 60) {
            minutes = (minutes + minutesToAdd) % 60;
            hoursToAdd++;
        } else {
            minutes += minutesToAdd;
        }

        hours = (hours + hoursToAdd) % 24;

        System.out.println(hours + ":" + minutes );
    }
}
