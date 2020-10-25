package pl.Osowicz.babyNames.resources;

public class Names implements Comparable<Names> {
    private int yearOfBirth;
    private String gender;
    private String ethnicity;
    private String firstName;
    private int count;
    private int rank;

    public Names(int yearOfBirth, String gender, String ethnicity, String firstName, int count, int rank) {
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.ethnicity = ethnicity;
        this.firstName = firstName;
        this.count = count;
        this.rank = rank;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getCount() {
        return count;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Names o) {
        return -(this.count - o.count);
    }

    @Override
    public String toString() {
        return "Name: " + firstName + ": count - " + count;
    }
}