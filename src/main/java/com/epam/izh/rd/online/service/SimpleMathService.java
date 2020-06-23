package com.epam.izh.rd.online.service;

public class SimpleMathService implements MathService {

    /**
     * Метод возвращает 0, если value1 = value2.
     * Метод возвращает -1, если value1 < value2.
     * Метод возвращает 1, если value1 > value2.
     *
     * Например для (-1, -1) метод должен вернуть 0;
     * Например для (-3, -1) метод должен вернуть -1;
     * Например для (3, 1) метод должен вернуть 1;
     */
    @Override
    public int compare(int value1, int value2) {
        if (value1 == value2) {
            return 0;
        }
        else if (value1 < value2) {
            return -1;
        }
        else  {
            return 1;
        }
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 < value2) {
            return value2;
        } else if (value1 == value2) {
            return 0;
        } else {
            return value1;
        }
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int maxNumber = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxNumber) {
                maxNumber = values[i];
            }
        }
        return maxNumber;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int sumNumber = 0;
        for (int i = 0; i < values.length; i++) {
            sumNumber = sumNumber + values[i];
        }
        return sumNumber;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        /*
        для начала необходимо узнать количество четных чисел, чтобы далее создать новый
        массив нужной длинны
        */
        int lenght = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 != 0) continue;
            lenght++;
        }
        /*
        Далее создаем новый массив и с помощью цикла заполняем его четными значениями из первого цикла
        */
        int[] newValues = new int [lenght];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 != 0) continue;
            newValues[index] = values[i];
            index++;
        }
        return newValues;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        long factorial = 1; // реализуем исключение для нуля
        if(initialVal>=0) { // защита от ввода отрицательных чисел, иначе их факториал так же приравняется к 1
            for (long i = 1; i <= initialVal; i++) { //если initialVal=0 то просто не заходит в цикл
                factorial = factorial * i;
            }
        }else{
            System.out.println("Ошибка! Введите целое неотрицательное число");
        }
        return factorial;
    }

    /**
     * Метод возвращает число, которе находится на заданной позиции (счет начинается с нуля) в ряду фибоначчи.
     *
     * Ряд фибоначчи - ряд, следующие элементы которого состоят из суммы двух предыдущих.
     * Ряд начинается 0 и 1.
     * Пример 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
     *
     * Для числа 9 метод должен вернуть 34
     * Для числа 0 метод должен вернуть 0
     */
    @Override
    public long calcFibonacci(int number) {
        long[] fibonacciMassive;
        if(number>=0) {
            fibonacciMassive = new long[number+2];
            // +2 для того чтобы при вводе 0 и 1 код работал корректно
            // создает один дополнительный элемент в массиве, возможно стоит доработать
            fibonacciMassive[0]=0;
            fibonacciMassive[1]=1;
            for (int i = 2; i < fibonacciMassive.length; i++) {
                fibonacciMassive[i]=fibonacciMassive[i-1]+fibonacciMassive[i-2];
            }
        }else{
            fibonacciMassive = new long[0];
            System.out.println("Ошибка! Введите целое неотрицательное число");
        }
        return fibonacciMassive[number];
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        return new int[]{};
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        return false;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        return new int[]{};
    }
}
