package com.rplbo.utskalkulator;

import java.util.Locale;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String bilanganstring) {
        this.bilanganstring = bilanganstring;
        String[] list = this.bilanganstring.split(" ");
        String stringA = list[0].toLowerCase();
        switch (stringA) {
            case "satu": bilangan = 1; break;
            case "dua": bilangan = 2;  break;
            case "tiga": bilangan = 3; break;
            case "empat": bilangan = 4; break;
            case "lima": bilangan = 5; break;
            case "enam": bilangan = 6; break;
            case "tujuh": bilangan = 7; break;
            case "delapan": bilangan = 8; break;
            case "sembilan": bilangan = 9; break;
            case "sepuluh": bilangan = 10; break;
            case "sebelas": bilangan = 11; break;
        }

        if (list.length > 1) {
            String stringB = list[1].toLowerCase();
            switch (stringB) {
                case "belas": bilangan += 10; break;
                case "puluh": bilangan += 10; break;
            }
        }

    }

    public int getBilangan() {
        return bilangan;
    }

    boolean apakahDuaDigit() {
        if (getBilangan() >= 10) {
            return true;
        }
        else {
            return false;
        }
    }

    boolean apakahLebihDari10() {
        if (getBilangan() >= 11) {
            return true;
        }
        else {
            return false;
        }
    }
}
