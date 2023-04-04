package com.example.qwirkle.server;

import com.example.qwirkle.GameInfo;
import com.example.qwirkle.GameTimer;

public class Timer extends GameInfo {

    private static final long serialVersionUID = -7040526713806444451L;

    private GameTimer myTimer;

    public Timer(GameTimer myTimer) {
        this.myTimer = myTimer;
    }

    public GameTimer getMyTimer() {
        return myTimer;
    }
}
