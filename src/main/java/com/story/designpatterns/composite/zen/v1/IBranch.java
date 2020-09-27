package com.story.designpatterns.composite.zen.v1;

import java.util.ArrayList;

public interface IBranch {
    public String getInfo();

    public void add(IBranch branch);

    public void add(ILeaf leaf);

    public ArrayList getSubOrdinateInfo();
}
