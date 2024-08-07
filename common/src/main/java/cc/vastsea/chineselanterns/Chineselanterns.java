package cc.vastsea.chineselanterns;

import cc.vastsea.chineselanterns.block.ModBlocks;
import cc.vastsea.chineselanterns.item.ModItemTab;
import cc.vastsea.chineselanterns.item.ModItems;

public final class Chineselanterns {
    public static final String MOD_ID = "chineselanterns";

    public static void init() {
        System.out.println("ChineseLantern initializing.");
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModItemTab.registerModItemTab();
    }
}
