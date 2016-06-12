package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так,
чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(short s) {    }
    public Solution(Double s) {    }
    public Solution(float s) {    }
    protected Solution(String string){}
    protected Solution(Float string){}
    protected Solution(Short string){}
    private Solution(long in){}
    private Solution(Integer in){}
    private Solution(int in){}
    Solution(Byte l){}
    Solution(byte l){}
    Solution(Long l){}
}

