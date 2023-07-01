package net.spooderman.everythingmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.spooderman.everythingmod.EverythingMod;
import net.spooderman.everythingmod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EverythingMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BLACK_OPAL_BLOCK);
        blockWithItem(ModBlocks.BLACK_OPAL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE);
        blockWithItem(ModBlocks.BLACK_OPAL_NETHERACK_ORE);
        blockWithItem(ModBlocks.BLACK_OPAL_ENDSTONE_ORE);

        blockWithItem(ModBlocks.LOTION_JUICE_BLOCK);
        blockWithItem(ModBlocks.LOTION_JUICE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_LOTION_JUICE_ORE);
        blockWithItem(ModBlocks.LOTION_JUICE_NETHERACK_ORE);
        blockWithItem(ModBlocks.LOTION_JUICE_ENDSTONE_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
