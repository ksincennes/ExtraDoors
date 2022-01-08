package com.extracraftx.minecraft.extradoors.mixin;

import com.extracraftx.minecraft.extradoors.tags.Tags;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.entity.ai.pathing.LandPathNodeMaker;

@Mixin(LandPathNodeMaker.class)
public class LandPathNodeMakerMixin {

    @Redirect(
        method = "getCommonNodeType",
        at = @At(target = "Lnet/minecraft/block/DoorBlock;isWoodenDoor(Lnet/minecraft/block/BlockState;)Z", value = "INVOKE")
    )
    private static boolean isInteractableDoor(BlockState state){
        return Tags.INTERACTABLE_DOORS.contains(state.getBlock()) || DoorBlock.isWoodenDoor(state);
    }

}