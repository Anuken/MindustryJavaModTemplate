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
         
    }

    @Override
    public void loadContent(){

        Events.on(ClientLoadEvent.class, e -> {
        		Time.runTask(30f, () -> {
        			 try{
        				new TestCustomGameDialog().init();
        			 }catch(NoSuchFieldException e3){
        	e3.printStackTrace();
        }catch(SecurityException e2){
        	e2.printStackTrace();
        }catch(IllegalArgumentException e4){
        	e4.printStackTrace();
        }catch(IllegalAccessException e5){
        	e5.printStackTrace();
        }
        		});
        	});
    }

}
