package example.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class ExItems implements ContentList{
    public static Item silver;

    @Override
    public void load(){
        silver = new Item("silver", Color.valueOf("ffffff")){{
            hardness = 2;
            cost = 2;
        }};
    }
}
