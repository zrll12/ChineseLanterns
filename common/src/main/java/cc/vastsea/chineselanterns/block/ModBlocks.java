package cc.vastsea.chineselanterns.block;

import cc.vastsea.chineselanterns.Chineselanterns;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class ModBlocks {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Chineselanterns.MOD_ID, Registries.BLOCK);
    public static final RegistrySupplier<Block> CHINESE_LANTERN = BLOCKS.register("lantern", () -> new Block(
            BlockBehaviour.Properties.of().strength(0.3F).instrument(NoteBlockInstrument.HAT)
                    .lightLevel((blockState) -> 15).isRedstoneConductor((var1, var2, var3) -> false)));

    public static void registerBlocks() {
        BLOCKS.register();
    }
}
