package example.content;

import mindustry.ctype.ContentList;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;

public class ExBlocks implements ContentList{

    public static Block
    silverWall;

    @Override
    public void load(){
        silverWall = new Wall("name"){{
            size = 2;
            health = 600;
        }};
    }
}
