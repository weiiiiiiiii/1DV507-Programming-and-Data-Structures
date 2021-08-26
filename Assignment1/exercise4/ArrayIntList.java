package ww222ag_assign1.exercise4;

public class ArrayIntList extends AbstractIntCollection implements IntList {
    @Override
    public void add(int n) {
        values[size++] = n;
        if(size==values.length) {
            //increase size
            resize();
        }
    }

    @Override
    public void addAt(int n, int index) throws IndexOutOfBoundsException {
        if (checkIndex(index, size+1)==false)
            throw new IndexOutOfBoundsException(index+" out of bounds");
        //shift right
        for(int i=size; i>index; i--)
            values[i] = values[i-1];
        size++;
        values[index] = n;
        if(size==values.length) {
            //increase size
            resize();
        }
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        if (checkIndex(index, size)==false)
            throw new IndexOutOfBoundsException(index+" out of bounds");
        //shift left
        for(int i=index; i<size; i++) {
            values[i] = values[i+1];
        }
        size--;
    }

    @Override
    public int get(int index) throws IndexOutOfBoundsException {
        if (checkIndex(index, size)==false)
            throw new IndexOutOfBoundsException(index+" out of bounds");
        return values[index];
    }

    @Override
    public int indexOf(int n) {
        for(int i=0; i<size; i++) {
            if(values[i]==n)
                return i;
        }
        return -1;
    }
}
