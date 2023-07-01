package net.spooderman.everythingmod.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.spooderman.everythingmod.block.ModBlocks;
import net.spooderman.everythingmod.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BLACK_OPAL_BLOCK.get());

        add(ModBlocks.BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.BLACK_OPAL_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));

        add(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_LOTION_JUICE_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));

        add(ModBlocks.BLACK_OPAL_NETHERACK_ORE.get(),
                (block) -> createOreDrop(ModBlocks.BLACK_OPAL_NETHERACK_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));

        add(ModBlocks.BLACK_OPAL_ENDSTONE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.BLACK_OPAL_ENDSTONE_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));

        dropSelf(ModBlocks.LOTION_JUICE_BLOCK.get());

        add(ModBlocks.LOTION_JUICE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.LOTION_JUICE_ORE.get(), ModItems.LOTION_JUICE.get()));

        add(ModBlocks.DEEPSLATE_LOTION_JUICE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_LOTION_JUICE_ORE.get(), ModItems.LOTION_JUICE.get()));

        add(ModBlocks.LOTION_JUICE_NETHERACK_ORE.get(),
                (block) -> createOreDrop(ModBlocks.LOTION_JUICE_NETHERACK_ORE.get(), ModItems.LOTION_JUICE.get()));

        add(ModBlocks.LOTION_JUICE_ENDSTONE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.LOTION_JUICE_ENDSTONE_ORE.get(), ModItems.LOTION_JUICE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
