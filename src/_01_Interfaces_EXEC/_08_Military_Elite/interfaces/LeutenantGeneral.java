package _01_Interfaces_EXEC._08_Military_Elite.interfaces;

import java.util.Collection;

public interface LeutenantGeneral extends Private {
    Collection<Private> getPrivates();

    void addPrivate(Private privateSoldier);
}
