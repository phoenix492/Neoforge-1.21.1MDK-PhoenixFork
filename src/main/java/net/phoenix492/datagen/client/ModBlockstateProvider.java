package net.phoenix492.datagen.client;

import net.phoenix492.replaceme.ReplaceMe;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockstateProvider extends BlockStateProvider {
    public ModBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ReplaceMe.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
