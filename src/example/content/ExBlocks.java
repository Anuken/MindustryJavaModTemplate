package example.content;

import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;

import static mindustry.type.ItemStack.*;

public class ExBlocks implements ContentList{

    public static Block
    silverWall;

    @Override
    public void load(){
        silverWall = new Wall("silver-wall"){{
            requirements(Category.defense, with(ExItems.silver, 40));
            size = 2;
            health = 600;
        }};
    }
}
