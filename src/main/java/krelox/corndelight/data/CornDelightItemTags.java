package krelox.corndelight.data;

import krelox.corndelight.CornDelightTags;
import krelox.corndelight.item.CornDelightItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;

public class CornDelightItemTags extends FabricTagProvider.ItemTagProvider {
    public CornDelightItemTags(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(CornDelightTags.Items.CORN).add(CornDelightItems.CORN);
        getOrCreateTagBuilder(CornDelightTags.Items.CORN_SEEDS).add(CornDelightItems.CORN_SEEDS);
        getOrCreateTagBuilder(CornDelightTags.Items.COOKED_CHICKEN).add(Items.COOKED_CHICKEN);
        getOrCreateTagBuilder(CornDelightTags.Items.COOKED_BEEF).add(Items.COOKED_BEEF);
        getOrCreateTagBuilder(CornDelightTags.Items.COOKED_MUTTON).add(Items.COOKED_MUTTON);
        getOrCreateTagBuilder(CornDelightTags.Items.COOKED_PORK).add(Items.COOKED_PORKCHOP);
        getOrCreateTagBuilder(CornDelightTags.Items.CORN_DELIGHT_MEAT)
                .addTag(CornDelightTags.Items.COOKED_CHICKEN)
                .addTag(CornDelightTags.Items.COOKED_BEEF)
                .addTag(CornDelightTags.Items.COOKED_MUTTON)
                .addTag(CornDelightTags.Items.COOKED_PORK);
    }
}
