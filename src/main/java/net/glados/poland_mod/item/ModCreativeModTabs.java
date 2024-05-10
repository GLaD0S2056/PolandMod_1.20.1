package net.glados.poland_mod.item;

import net.glados.poland_mod.PolandMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PolandMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PIEROGI_SER.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PIEROGI_SER.get());
                        pOutput.accept(ModItems.PIEROGI_RUSKIE.get());
                        pOutput.accept(ModItems.PIEROGI_KAPUSTA.get());
                        pOutput.accept(ModItems.PIEROGI_JAGODY.get());
                        pOutput.accept(ModItems.PIEROGI_MIESO.get());
                        pOutput.accept(ModItems.BIGOS.get());
                        pOutput.accept(ModItems.BURSZTYN.get());

                        //armor
                        pOutput.accept(ModItems.BURSZTYN_HELMET.get());
                        pOutput.accept(ModItems.BURSZTYN_CHESTPLATE.get());
                        pOutput.accept(ModItems.BURSZTYN_LEGGINGS.get());
                        pOutput.accept(ModItems.BURSZTYN_BOOTS.get());



                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}