package com.company.JavaCore.Level_8.Wrapper;

public class CatWrapper extends Cat{
    private Cat original;


    public CatWrapper(Cat cat) {
        super(cat.getCatName());
        this.original = cat;
    }

    @Override
    public String getCatName() {
        return "Cat name " + original.getCatName();
    }

    @Override
    public void setCatName(String catName) {
        original.setCatName(catName);
    }
}
