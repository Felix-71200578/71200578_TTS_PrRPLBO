package com.rplbo.utskalkulator;
import java.lang.Math;

public class Kalkulator {
    private int bil1;
    private int bil2;
    private String op;

    public Kalkulator(BilanganString bil1,BilanganString bil2, Operator op) {
        this.bil1 = bil1.getBilangan();
        this.bil2 = bil2.getBilangan();
        this.op = op.getOperatorSimbol();
    }

    public void hitung() {
        double h = 0;
        switch (this.op) {
            case "*": h = this.bil1 * this.bil2; break;
            case "/": h = this.bil1 / this.bil2; break;
            case "+": h = this.bil1 + this.bil2; break;
            case "-": h = this.bil1 - this.bil2; break;
            case "^": h = Math.pow(this.bil1, this.bil2); break;
        }
        String hasil = String.valueOf(h);
        System.out.println("Hasil: "+hasil);
    }

}
