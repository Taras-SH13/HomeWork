package homeworkGeneric;

public class Number{

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
}

