package com.javarush.test.level26.lesson08.task02;

import java.util.concurrent.atomic.AtomicInteger;

/* Мудрый человек думает раз, прежде чем два раза сказать.
Все методы класса Solution должны быть потоково-безопасными.
Сделайте так, чтобы оба метода могли выполняться одновременно двумя различными трэдами.
synchronized(this) для этого не подходит, используйте другой объект для лока.
*/
public class Solution {
    int var1;
    int var2;
    int var3;
    int var4;

    public Solution(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public int getSumOfVar1AndVar2() {
        AtomicInteger aVar1 = new AtomicInteger(this.var1);
        int out = aVar1.getAndAdd(this.var2);
        return out;
    }

    public int getSumOfVar3AndVar4() {
        AtomicInteger aVar3 = new AtomicInteger(this.var3);
        int out2 = aVar3.getAndAdd(this.var4);
        return out2;
    }
}
