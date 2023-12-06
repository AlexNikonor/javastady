public class Main {
    public static void main(String[] args) {
        Person[] group = new Person[100];
        for (int i = 0; i < group.length; i++) {
            group[i] = new Person("Вася", 2023 - (i + 1), 'M');

            System.out.println(group[i].whoAMI());
        }

    }
}
 class Person {
    private String name;
    private int years;
    private char gender;

    public String whoAMI() {
        return "Меня зовут " + name + ". мне " + (2023 - years) + " " + suf(2023 - years);

    }

    private String suf(int age) {
        int ageLastNumber = age % 10;
        String old = "";

        if (ageLastNumber == 1)
            old = "год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = "лет";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            old = "года";
        if ((age % 100 >= 11) && (age % 100 <= 14))
            old = "лет";
        return old;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int years, char gender) {
        this.name = name;
        this.years = years;
        this.gender = gender;

    }
}

