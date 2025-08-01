package com.zoompackers.advancedenderite;

import com.zoompackers.advancedenderite.init.AdvancedenderiteModBlocks;
import com.zoompackers.advancedenderite.init.AdvancedenderiteModItems;
import com.zoompackers.advancedenderite.init.AdvancedenderiteModSounds;
import com.zoompackers.advancedenderite.init.AdvancedenderiteModTabs;
import com.zoompackers.advancedenderite.item.v2.ArmorMaterials;

public final class AdvancedEnderite {
    public static final String MOD_ID = "advancedenderite";

    public static void init() {
        // Write common init code here.
        AdvancedenderiteModTabs.bootstrap();
        AdvancedenderiteModBlocks.bootstrap();
        AdvancedenderiteModSounds.bootstrap();
        AdvancedenderiteModItems.bootstrap();
        ArmorMaterials.bootstrap();
    }
}
