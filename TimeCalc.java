public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time = args [0];
        int minutesToAdd = Integer.parseInt (args[1]) ; 
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        int TotalMinutes = ((hours * 60) + minutes + minutesToAdd); 
        int TotalHours = (TotalMinutes / 60); 
        int NewHours = (TotalHours % 24); 
        int NewMinutes = (TotalMinutes - (TotalHours * 60));

       if (NewHours < 10 && NewMinutes < 10) {
    System.out.println("0" + NewHours + ":" + "0" + NewMinutes);
} else if (NewHours < 10) {
    System.out.println("0" + NewHours + ":" + NewMinutes);
} else if (NewMinutes < 10) {
    System.out.println(NewHours + ":" + "0" + NewMinutes);
} else {
    System.out.println(NewHours + ":" + NewMinutes);
}
    }
}
