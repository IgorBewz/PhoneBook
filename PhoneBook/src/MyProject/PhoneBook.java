package MyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//���� Phonebook ������ ���� ������ ���������� �������
//�� ���������� �� ����� ������ ArrayList
//� ����� ����� ��������������� �������, ��'� �� ����� ��������
//���� ������ � ���� ����� main ������ ������� ������ � ��
//����� ����� ������
//NewAbonent - ���� ����� ��  ������ ��������, ������� �� ����
//DelAbonent - ������� ����� �� ������ ��������
//SavePB - ������ �� � ���������� ���� phone.txt
//LoadPB - ������� �� � ���������� ����� phone.txt
//PrintPhonebook - �������� �� ����� �� ������ ��
//SearchFirstName - ������ ����� ������� �� ��'� �� ������ ��������
//SearchNumberPhone - ������ ����� ������ ������ �� ������� ��������
//EditingAbonent - ������ ����������� ����� �������� ��������
public class PhoneBook {
    public static void main(String[] args) throws IOException {
       // �������� ���� ��������
       // ��� ����� ���������� ������ ���� ��������� ���������� ����� ��� ���� ����������
        NewAbonent();// �����, ���� ������ ��� ����� � ������





    }
    public static void NewAbonent() throws IOException { // ����� ���� ������ ��������� �������� �� ��
        List<Note>list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("������ ������� ��������: ");
        String firstname1 = reader.readLine();
        System.out.print("������ ��'� ��������: ");
        String lastname1 = reader.readLine();
        System.out.print("������ ����� ��������: ");
        int number1 = Integer.parseInt(reader.readLine());
        Note note = new Note(firstname1,lastname1,number1);
        list.add(note);
        System.out.println(list);
    }
}
