package arraySorting;

public abstract class Sorting {
    protected int[] array;

    public Sorting(int[] array) {
        this.array = array;
    }

    abstract void sort();
}
