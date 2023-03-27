package com.example.design.creat.factory;

public class FactoryTree {
    public static tree getTreeType(TreeType treeType){
        if (treeType == treeType.FRUIT){
            return new FruitTrees();}
        else if (treeType == treeType.AGRICULTURAL ){
            return new AgriculturalCrops();
        } return null;
    }
}
