package com.rplbo.utskalkulator;

public class Operator {
    private String operatorString;
    private String operatorSimbol;

    public Operator(String operatorString) {
        this.operatorString = operatorString;
        switch (operatorString.toLowerCase()) {
            case "kali": operatorSimbol = "*"; break;
            case "bagi": operatorSimbol = "/"; break;
            case "tambah": operatorSimbol = "+"; break;
            case "kurang": operatorSimbol = "-"; break;
            case "pangkat": operatorSimbol = "^"; break;
        }
    }

    public String getOperatorSimbol() {
        return operatorSimbol;
    }
}
