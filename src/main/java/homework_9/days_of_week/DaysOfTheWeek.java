package homework_9.days_of_week;

public enum DaysOfTheWeek {
    MON("Monday"),
    TUE("Tuesday"),
    WED("Wednesday"),
    THU("Thursday"),
    FRI("Friday"),
    SAT("Saturday"),
    SUN("Sunday")
    ;

    private String day;
    private DaysOfTheWeek(String day){
        this.day = day;
    }
    public String getDay(){
        return this.day;
    }

    public int dayOfWeek(String str){
        switch (str){
            case "Monday":
                return 1;
            case "Tuesday":
                return 2;
            case "Wednesday":
                return 3;
            case "Thursday":
                return 4;
            case "Friday":
                return 5;
            case "Saturday":
                return 6;
            case "Sunday":
                return 7;
            default:
                return -1;
        }
    }
}
