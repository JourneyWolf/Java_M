package homeWork15_2.Lesson15_3;
import homeWork15_2.Lesson15_3.Array;

public class Main {
    public static void main(String[] args) {
        // Сформируйте массив, который хранит названия дней недели при условии, что первый рабочий день недели
        // - это Понедельник, а последний - Воскресенье. Переопределите этот массив так, чтобы первым рабочим днем недели стало Воскресенье, а последним - Суббота.
        String [] arrDays ={"Понедельник","Вторник","Среда","Четверг","Пятница","Суббота","Воскресенье"};
        Array nums = new Array(arrDays);

        nums.redefineDays();
    }
}