package cc.vastsea.chineselanterns.item;

import cc.vastsea.chineselanterns.Chineselanterns;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

public class ModItemTab {
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Chineselanterns.MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final RegistrySupplier<CreativeModeTab> MOD_TAB = TABS.register("chinese_lantern", () -> CreativeTabRegistry.create(Component.translatable("itemGroup.modTab"),
            () -> ModItems.CHINESE_LANTERN_ITEM.get().asItem().getDefaultInstance()));

    public static void registerModItemTab() {
        TABS.register();
    }
}
