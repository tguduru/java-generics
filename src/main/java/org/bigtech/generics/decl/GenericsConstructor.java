package org.bigtech.generics.decl;

/**
 * @author Guduru, Thirupathi (TG028792)
 */
public class GenericsConstructor<T extends Operation, S extends Result> {
    private T t;
    private S s;

    public GenericsConstructor(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public int getValues() {
        int val1 = t.doOperation();
        int val2 = s.getOperationValue();
        return val1 + val2;
    }

    public static void main(String[] args) {
        OperationImpl operation = new OperationImpl();
        ResultImpl result = new ResultImpl();
        GenericsConstructor<OperationImpl,ResultImpl> constructor = new GenericsConstructor(operation, result);
        System.out.println(constructor.getValues());
    }

}
