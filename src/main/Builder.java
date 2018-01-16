package main;

import work.Element;

public interface Builder {
    Builder buildPart();
    Element getResult();
}
