package com.dxtl.btc.Items.tool;

import com.dxtl.btc.interfaces.IHasModel;
import com.dxtl.btc.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CatFoodPickaxe extends ItemPickaxe implements IHasModel {
    public CatFoodPickaxe(String name, ToolMaterial material) {
        super(material);
        InitHelper.itemInit(this, name, CreativeTabs.TOOLS);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(this);
    }
}
