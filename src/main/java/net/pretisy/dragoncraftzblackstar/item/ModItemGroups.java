package net.pretisy.dragoncraftzblackstar.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pretisy.dragoncraftzblackstar.DragonCraftZBlackStar;

public class ModItemGroups {
    public static final ItemGroup SENZU_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DragonCraftZBlackStar.MOD_ID, "dragoncraftzblackstartab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dragoncraftzblackstartab"))
                    .icon(() -> new ItemStack(ModItems.LESSER_SENZU_BEAN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LESSER_SENZU_BEAN);
                        entries.add(ModItems.GREATER_SENZU_BEAN);
                        entries.add(ModItems.DARK_SENZU_BEAN);



                    }).build());

    public static void registerItemGroups() {
        DragonCraftZBlackStar.LOGGER.info("Registering Item Groups for " + DragonCraftZBlackStar.MOD_ID);
    }
}
