package com.dxtl.btc.Blocks;

import com.dxtl.btc.interfaces.IHasModel;
import com.dxtl.btc.util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CatfoodBlock extends Block implements IHasModel {
    public CatfoodBlock(String name) {
        super(Material.CLOTH);
        InitHelper.blockInit(this, name, CreativeTabs.DECORATIONS);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }
}
