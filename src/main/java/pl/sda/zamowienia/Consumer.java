package pl.sda.zamowienia;

public class Consumer {

    String name;
    String surname;
    String email;
    int age;

    public Consumer() {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameProductException {
        if (!name.equals(name.toUpperCase())) {
            throw new NameProductException("Użyj dużych liter");
        } else {
            this.name = name.toUpperCase();
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws NameProductException {
        if (!surname.equals(surname.toUpperCase())) {
            throw new NameProductException("Użyj dużych liter");
        } else {
            this.surname = surname;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean checkEmail(String email) {
        return email.contains("@");
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) throws EmailException {
        if (!this.checkEmail(email)) {
            throw new EmailException("Niepoprawny email");
        } else {
            this.email = email;
        }
    }
    public void setAge(int age) throws AgeConsumerException {
        if (age < 18) {
            throw new AgeConsumerException("Jesteś niepełnoletni");
        } else {
            this.age = age;
        }
    }
}
