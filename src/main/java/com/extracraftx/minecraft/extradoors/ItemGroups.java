package com.extracraftx.minecraft.extradoors;

import com.extracraftx.minecraft.extradoors.block.Blocks;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ItemGroups {

    public static ItemGroup TRAPDOOR_GROUP;
    public static ItemGroup DOOR_GROUP;

    public static void createItemGroups() {
        TRAPDOOR_GROUP = FabricItemGroupBuilder.create(new Identifier(ExtraDoors.MOD_ID, "trapdoors"))
            .icon(() -> {return new ItemStack(Items.OAK_TRAPDOOR);})
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.OAK_TRAPDOOR));
                stacks.add(new ItemStack(Items.SPRUCE_TRAPDOOR));
                stacks.add(new ItemStack(Items.BIRCH_TRAPDOOR));
                stacks.add(new ItemStack(Items.JUNGLE_TRAPDOOR));
                stacks.add(new ItemStack(Items.ACACIA_TRAPDOOR));
                stacks.add(new ItemStack(Items.DARK_OAK_TRAPDOOR));
                stacks.add(new ItemStack(Items.CRIMSON_TRAPDOOR));
                stacks.add(new ItemStack(Items.WARPED_TRAPDOOR));
                stacks.add(new ItemStack(Items.IRON_TRAPDOOR));

                stacks.add(new ItemStack(Blocks.GOLD_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.BAMBOO_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.GLASS_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.PURPUR_TRAPDOOR));

                stacks.add(new ItemStack(Blocks.OAK_GLASS_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.SPRUCE_GLASS_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.BIRCH_GLASS_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.JUNGLE_GLASS_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.ACACIA_GLASS_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.DARK_OAK_GLASS_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.CRIMSON_GLASS_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.WARPED_GLASS_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.IRON_GLASS_TRAPDOOR));

                stacks.add(new ItemStack(Blocks.GOLD_GLASS_TRAPDOOR));
                stacks.add(new ItemStack(Blocks.PURPUR_GLASS_TRAPDOOR));
            })
            .build();
        
        DOOR_GROUP = FabricItemGroupBuilder.create(new Identifier(ExtraDoors.MOD_ID, "doors"))
            .icon(() -> {return new ItemStack(Items.OAK_DOOR);})
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.IRON_DOOR));
                stacks.add(new ItemStack(Items.OAK_DOOR));
                stacks.add(new ItemStack(Items.SPRUCE_DOOR));
                stacks.add(new ItemStack(Items.BIRCH_DOOR));
                stacks.add(new ItemStack(Items.JUNGLE_DOOR));
                stacks.add(new ItemStack(Items.ACACIA_DOOR));
                stacks.add(new ItemStack(Items.DARK_OAK_DOOR));
                stacks.add(new ItemStack(Items.CRIMSON_DOOR));
                stacks.add(new ItemStack(Items.WARPED_DOOR));

                stacks.add(new ItemStack(Blocks.GOLD_DOOR));
                stacks.add(new ItemStack(Blocks.BAMBOO_DOOR));
                stacks.add(new ItemStack(Blocks.GLASS_DOOR));
                stacks.add(new ItemStack(Blocks.PURPUR_DOOR));
                
                stacks.add(new ItemStack(Blocks.IRON_GLASS_DOOR));
                stacks.add(new ItemStack(Blocks.OAK_GLASS_DOOR));
                stacks.add(new ItemStack(Blocks.SPRUCE_GLASS_DOOR));
                stacks.add(new ItemStack(Blocks.BIRCH_GLASS_DOOR));
                stacks.add(new ItemStack(Blocks.JUNGLE_GLASS_DOOR));
                stacks.add(new ItemStack(Blocks.ACACIA_GLASS_DOOR));
                stacks.add(new ItemStack(Blocks.DARK_OAK_GLASS_DOOR));
                stacks.add(new ItemStack(Blocks.CRIMSON_GLASS_DOOR));
                stacks.add(new ItemStack(Blocks.WARPED_GLASS_DOOR));

                stacks.add(new ItemStack(Blocks.GOLD_GLASS_DOOR));
                stacks.add(new ItemStack(Blocks.PURPUR_GLASS_DOOR));
            })
            .build();
    }

}