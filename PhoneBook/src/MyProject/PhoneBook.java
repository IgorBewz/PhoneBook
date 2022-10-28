package MyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Клас Phonebook реалізує базу данних «Телефоний довідник»
//БД побудована на основі масиву ArrayList
//в якості даних використовується Прізвище, Ім'я та номер абонента
//клас включає в себе метод main котрий запускає работу с БД
//також додані методи
//NewAbonent - додає запис по  номеру телефона, прізвищу та імені
//DelAbonent - видаляє запис по номеру телефона
//SavePB - зберігає БД в текстовому файлі phone.txt
//LoadPB - загружає БД з текстового файлу phone.txt
//PrintPhonebook - виводить на екран всі записи БД
//SearchFirstName - виконує пошук Прізвища та ім'я по номеру телефона
//SearchNumberPhone - виконує пошук списка номерів по Прізвищу абонента
//EditingAbonent - виконує редагування даних обраного абонента
public class PhoneBook {
    public static void main(String[] args) throws IOException {
       // Реалізуємо меню програми
       // При виборі відповідного пункту меню запускаємо необхідний метод для його реалізаціїї
        NewAbonent();// Метод, який реалізує ввід даних з консолі





    }
    public static void NewAbonent() throws IOException { // Метод який реалізує додавання абонента до БД
        List<Note>list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введіть прізвище абонента: ");
        String firstname1 = reader.readLine();
        System.out.print("Введіть ім'я абонента: ");
        String lastname1 = reader.readLine();
        System.out.print("Введіть номер абонента: ");
        int number1 = Integer.parseInt(reader.readLine());
        Note note = new Note(firstname1,lastname1,number1);
        list.add(note);
        System.out.println(list);
    }
}
