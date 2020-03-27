package homeworkGeneric;

public class Number implements  Comparable<Number>{

    private Integer item;


    public Number(Integer item1) {
        this.item = item1;

    }

    public Integer getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Number { "+ item
                +" }";
    }

    @Override
    public int compareTo(Number number) {
        return 0;
    }
}

