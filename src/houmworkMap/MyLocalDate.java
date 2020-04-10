package houmworkMap;

public class MyLocalDate {

    int day;
    int month;
    int eyar;

    public MyLocalDate(int day, int month, int eyar) {
        this.day = day;
        this.month = month;
        this.eyar = eyar;
    }

    @Override
    public String toString() {
        return "Дата "+
                day+"/" +
                month+"/"+
                eyar;

    }
}
