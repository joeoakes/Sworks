package edu.psu.ab.ist.sworks.pojo;

public class Timer {

    private int _timer_duration;
    private String _timer_string;


    public Timer() {}

    public Timer(int timer_duration) {
        this._timer_duration = timer_duration;
    }

    public Timer(String timer_duration) {
        this._timer_string = timer_duration;
    }

    public int getTimerDuration() {
        return _timer_duration;
    }

    public void setTimerDuration(int timer_duration) {
        this._timer_duration = timer_duration;
    }

    public String get_timer_string() {
        return _timer_string;
    }

    public void set_timer_string(String timer_string) {
        this._timer_string = timer_string;
    }
}
