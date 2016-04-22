package org.bigtech.generics.decl;

import java.util.Random;

/**
 * @author Guduru, Thirupathi (TG028792)
 */
public interface Result {
    public int getOperationValue();
}
class ResultImpl implements Result{
    @Override
    public int getOperationValue() {
        return new Random().nextInt();
    }
}