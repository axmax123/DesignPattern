package com.example.design.creat.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactoryMain {
    public static void main(String[] args){
        FruitTrees fruitTree = (FruitTrees) FactoryTree.getTreeType(TreeType.FRUIT);
        log.info(fruitTree.treeName());
        log.info(fruitTree.roots());
        log.info("================================");
        tree agriculturalCrops = FactoryTree.getTreeType(TreeType.AGRICULTURAL);
        log.info(agriculturalCrops.treeName());
        log.info("================================");
        tree test = FactoryTree.getTreeType(null);
        log.info("none");
//        Object none = null;
//        System.out.println(none);
    }
}
