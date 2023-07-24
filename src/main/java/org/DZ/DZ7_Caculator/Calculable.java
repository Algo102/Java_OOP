package org.DZ.DZ7_Caculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    Calculable dividi(int arg);
    Calculable menos(int arg);
    int getResult();
}
