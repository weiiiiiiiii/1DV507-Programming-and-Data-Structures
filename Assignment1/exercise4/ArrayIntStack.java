package ww222ag_assign1.exercise4;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
    @Override
    public void push(int n) {
        values[size++] = n;
        if(size==values.length) {
            //increase size
            resize();
        }
    }

    @Override
    public int pop() throws IndexOutOfBoundsException {
        if(size==0) {
            throw new IndexOutOfBoundsException("Empty stack");
        }
        int tmp =  values[size-1];
        for(int i=(size-1); i<size; i++) {
            values[i] = values[i+1];
        }
        size--;
        return tmp;
    }

    @Override
    public int peek() throws IndexOutOfBoundsException {
        if(size==0) {
            throw new IndexOutOfBoundsException("Empty stack");
        }
        return values[size-1];
    }
}
