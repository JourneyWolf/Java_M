package homeWork21.exercise2;

import java.util.Locale;
import java.util.Random;

//. Дано предложение: "Казнить нельзя помиловать".
//Поменяйте первое и последнее слово в нем местами;
//добавьте в него запятую на нужном месте и выведите на печать.
public class Exercise {
    public static void main(String[] args) {
        String proposal = "Казнить нельзя Помиловать";

        String[] x = proposal.split(" "); //разделяю строки на подстроки
        String word = x[2];//назначаю переменную word для x[2]
// меняю значений между индексами 0 и 2
        x[2] = x[0];
        x[0] = word;
        x[0] = x[0]+ ",";  // // Вставка запятой между словами

        String res = String.join(" ", x);//String.join - возвращает новую строку, которая содержит все элементы, разделенные указанным разделителем.
        System.out.println(res);
    }
}






