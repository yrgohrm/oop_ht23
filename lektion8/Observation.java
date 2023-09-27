
public class Observation {
    private int id;
    private int hour;
    private int min;
    private double temp;
    private double windSpeed;
    private double windDir;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindDir() {
        return windDir;
    }

    public String getWindDirAsString() {
        if (windDir >= (360 - 11.25) && windDir <= 11.25) {
            return "N";
        }
        else if (windDir <= 22.5) {
            return "NNO";
        }
        // fler villkor här...


        return "NNV";
    }

    public void setWindDir(double windDir) {
        if (windDir < 0 || windDir >= 360) {
            throw new IllegalArgumentException("windDir must be [0-360)");
        }

        this.windDir = windDir;
    }
}
