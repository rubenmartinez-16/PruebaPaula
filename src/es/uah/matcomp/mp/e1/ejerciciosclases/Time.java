package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public String toString(){
        if (second <= 9){
            if(minute <= 9){
                if(hour <= 9) {
                    return "0"+hour+":0"+minute+":0"+second;
                }
                else{
                    return hour+":0"+minute+":0"+second;
                }
            }
            else{
                if(hour <= 9) {
                    return "0"+hour+":"+minute+":0"+second;
                }
                else{
                    return hour+":"+minute+":0"+second;
                }
            }
        }
        else{
            if(minute <= 9){
                if(hour <= 9) {
                    return "0"+hour+":0"+minute+":"+second;
                }
                else{
                    return hour+":0"+minute+":"+second;
                }
            }
            else{
                if(hour <= 9) {
                    return "0"+hour+":"+minute+":"+second;
                }
                else{
                    return hour+":"+minute+":"+second;
                }
            }
        }
    }
    public Time nextSecond(){
        if (second == 59){
            if (minute == 59){
                if (hour == 23){
                    this.second = 0;
                    this.minute = 0;
                    this.hour = 0;
                }
                else{
                    this.second = 0;
                    this.minute = 0;
                    this.hour += 1;
                }
            }
            else{
                this.second = 0;
                this.minute += 1;
            }
        }
        else{
            this.second += 1;
        }
        return this;
    }
    public Time previousSecond(){
        if (second == 0){
            if (minute == 0){
                if (hour == 0){
                    this.second = 59;
                    this.minute = 59;
                    this.hour = 23;
                }
                else{
                    this.second = 59;
                    this.minute = 59;
                    this.hour -= 1;
                }
            }
            else{
                this.second = 59;
                this.minute -= 1;
            }
        }
        else{
            this.second -= 1;
        }
        return this;
    }
}
