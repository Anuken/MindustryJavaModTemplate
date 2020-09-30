package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
         try{
        	new TestCustomGameDialog().init();
        }catch(NoSuchFieldException e){
        	e.printStackTrace();
        }catch(SecurityException e){
        	e.printStackTrace();
        }catch(IllegalArgumentException e){
        	e.printStackTrace();
        }catch(IllegalAccessException e){
        	e.printStackTrace();
        }
	}
    }

    @Override
    public void loadContent(){

        new Item("cckpr", Color.valueOf("d99d73")){{
            hardness = 1;
            cost = 0.5f;
            alwaysUnlocked = true;
        }};
    }

}
