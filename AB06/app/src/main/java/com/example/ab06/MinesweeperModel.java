package com.example.ab06;

import android.util.Log;
import java.util.Random;

public class MinesweeperModel {

    private static MinesweeperModel instance = null;
    Random rand = new Random();

    private MinesweeperModel(){}

    PixelGridView s = new PixelGridView(new MainActivity());

    public static MinesweeperModel getInstance(){
        if(instance == null){
            instance = new MinesweeperModel();
        }
        return instance;
    }
    static void randomizer(){

    }
}
