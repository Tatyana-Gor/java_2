package ru.Gorshkova.HomeWorkJava2.lesson2;

public class Main {

    public static void main(String[] args) {

        String[][] myMass = new String[][]{{"1", "1", "1", "1"}, {"2", "False", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        for (int i = 0; i < myMass.length; i++) {
            for (int j = 0; j < myMass[i].length; j++) {
                System.out.print(myMass[i][j] + "\t");
            }
            System.out.println();
        }


        try {
            try {
                int result = myMethod(myMass);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Неправильный размер массива");
                e.printStackTrace();
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);



        }


    }

    private static int myMethod(String[][] myMass) throws MyArraySizeException, MyArrayDataException {
        int max_n = 4;
        int sum = 0;
        if (myMass.length != max_n) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < myMass.length; i++) {
            if (myMass[i].length != max_n) {
                throw new MyArraySizeException();

            }
            for (int j = 0; j < myMass[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(myMass[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);

                }
            }

        }

        return sum;
    }
}


