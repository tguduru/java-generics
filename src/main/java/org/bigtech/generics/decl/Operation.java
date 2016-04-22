package org.bigtech.generics.decl;

import java.util.Random;

/**
 * @author Guduru, Thirupathi (TG028792)
 */
public interface Operation {
    public int doOperation();
}
class OperationImpl implements Operation{
    @Override
    public int doOperation() {
        return new Random().nextInt();
    }
}
