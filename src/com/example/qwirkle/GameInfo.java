package com.example.qwirkle;

import com.example.qwirkle.Game;

import java.io.Serializable;

public abstract class GameInfo implements Serializable {
    private static final long serialVersionUID = 5087045L;

    void setGame(Game game){}
}
