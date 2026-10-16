package com.dragn0007.dragnloequestrian.items.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BridleItem extends Item {
    //Items that can go in the Bridle slot and allow the player to control a mount while riding.

    public BridleItem() {
        super(new Item.Properties());
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("Placeholder").withStyle(ChatFormatting.GOLD));
    }
}