package cc.vastsea.chineselanterns.item;

import cc.vastsea.chineselanterns.Chineselanterns;
import cc.vastsea.chineselanterns.block.ModBlocks;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModItems {
    private static final DeferredRegister<Item> ITEM = DeferredRegister.create(Chineselanterns.MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Item> CHINESE_LANTERN_ITEM = ITEM.register("lantern", () -> new BlockItem(ModBlocks.CHINESE_LANTERN.get(), new Item.Properties().arch$tab(ModItemTab.MOD_TAB.get())));

    public static void registerItems() {
        ITEM.register();
    }
}
