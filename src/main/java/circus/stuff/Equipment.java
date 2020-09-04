<<<<<<< HEAD:src/main/java/Equipment.java
public abstract class Equipment implements Asset{
=======
package circus.stuff;

import circus.Asset;

public abstract class Equipment implements Asset {
>>>>>>> inlecture:src/main/java/circus/stuff/Equipment.java
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getValue() {
        return purchasePrice;
    }
}
