package MyProject;

//* ���� Note ������ ���� �������� �� �����������
public class Note {
    private String firstname;//������� ��������
    private String lastname;//��'� ��������
    private int number; //��������� �����
    Note(String firstname, String lastname, int number){ // ����������� ����� Note
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
    }
    @Override
    public String toString() { // ���������� ����� ��� ������������ ������ ��������
        return "������� " + firstname + ", ��'� " + lastname +", ����� "+ number;
    }
}
