public class Clock {
    public void printTime() {
        System.out.println("Klockan är 8:45");
    }

    public void printTime(String language) {
        if (language.equals("engelska")) {
            System.out.println("The time is 8:45 am");
        }
        else {
            // ?????
        }
    }

    public void printTime(int times) {
        for (int i = 0; i < times; i++) {
            printTime();
        }
    }

    public void printTime(int times, String language) {

    }

    public void printTime(String language, int times) {

    }

    public void printTime(int times, int maxlength) {

    }

    // går inte
    // public void printTime(int maxlength, int times) {
    // }
}
