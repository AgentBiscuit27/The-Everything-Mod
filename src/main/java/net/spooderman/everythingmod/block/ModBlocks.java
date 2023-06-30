package net.spooderman.everythingmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spooderman.everythingmod.EverythingMod;
import net.spooderman.everythingmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EverythingMod.MOD_ID);

    public static final RegistryObject<Block> BLACK_OPAL_BLOCK = registerBlock("black_opal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_OPAL_ORE = registerBlock("black_opal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));

    public static final RegistryObject<Block> DEEPSLATE_BLACK_OPAL_ORE = registerBlock("deepslate_black_opal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));

    public static final RegistryObject<Block> BLACK_OPAL_NETHERACK_ORE = registerBlock("black_opal_netherack_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));

    public static final RegistryObject<Block> BLACK_OPAL_ENDSTONE_ORE = registerBlock("black_opal_endstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(8f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));

    public static final RegistryObject<Block> LOTION_JUICE_BLOCK = registerBlock("lotion_juice_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LOTION_JUICE_ORE = registerBlock("lotion_juice_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> DEEPSLATE_LOTION_JUICE_ORE = registerBlock("deepslate_lotion_juice_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(8f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> LOTION_JUICE_NETHERACK_ORE = registerBlock("lotion_juice_netherack_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> LOTION_JUICE_ENDSTONE_ORE = registerBlock("lotion_juice_endstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
