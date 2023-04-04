package com.example.qwirkle;



public class GameTimer {

    private Tickable tickable;

    private int ticks;

    private int interval;

    private Thread thread;

    public GameTimer(Tickable tickable) {
        this.tickable = tickable;
        ticks=0;
        thread=null;
    }
    public void start() {
        // synchronize to ensure null test and thread-start are "atomic"
        synchronized(this) {
            if (thread == null) {
                // if thread is not null create new timer object/thread
                // and start it
                Clock timer = new Clock();
                thread = new Thread(timer);
                thread.start();
            }
        }
    }
    public void reset() {
        ticks = 0;
    }

    public Tickable getTickable() {
        return tickable;
    }

    public void setTickable(Tickable tickable) {
        this.tickable = tickable;
    }

    public int getTicks() {
        return ticks;
    }

    public void setTicks(int ticks) {
        this.ticks = ticks;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = Math.max(0,interval);
    }
    public void stop(){
        thread=null;
    }

    private class Clock implements Runnable{

        @Override
        public void run() {
            while (thread != null)
                try {
                    Thread.sleep(interval); // wait for appropriate interval
                    ticks++;
                    tickable.tick(GameTimer.this); // apply action to target
                }
                catch (InterruptedException ix) {
                    // this should never happen, but if it does, loop back
                }
        }
    }
}
