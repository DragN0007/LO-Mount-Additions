package com.dragn0007.dragnloequestrian.items.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FaceCosmeticItem extends Item {
    public final DyeColor color;

    public FaceCosmeticItem(DyeColor dyeColor, Item.Properties properties) {
        super(properties);
        this.color = dyeColor;
    }

    public DyeColor getColor() {
        return this.color;
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("Placeholder").withStyle(ChatFormatting.GOLD));
    }
}