package ww222ag_assign1.exercise4;



public class CollectionMain {
    public static void main(String[] args) {
        //start int array list
        System.out.println("ARRAY INT LIST");
        ArrayIntList arrayList = new ArrayIntList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        System.out.println("Size: "+arrayList.size());
        arrayList.addAt(4,1);
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        int intGetter=arrayList.get(0);
        System.out.println("Got: "+intGetter);
        int indexOf = arrayList.indexOf(3);
        System.out.println("Index of number 3: "+indexOf);
        System.out.println("\nARRAY INT STACK");
        //start int array stack
        ArrayIntStack arrayStack = new ArrayIntStack();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        System.out.println(arrayStack);
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack);
    }
}
