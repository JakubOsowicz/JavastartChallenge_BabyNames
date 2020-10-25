package pl.Osowicz.babyNames.resources;

public class Letters implements Comparable<Letters> {
    private String letter;
    private int count;

    public Letters(String letter, int count) {
        this.letter = letter;
        this.count = count;
    }

    public String getLetter() {
        return letter;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Letter: " + letter + ", names starts on this letter: " + count;
    }


    @Override
    public int compareTo(Letters o) {
        return -(this.count - o.count);
    }
}