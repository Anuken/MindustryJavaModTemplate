package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;

public class ExampleJavaMod extends Mod{

    //register event handlers and create variables in the constructor
    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        Events.on(ClientLoadEvent.class, e -> {
            Time.runTask(10f, () -> Vars.ui.showInfo("it works. incredib le."));
        });
    }

    @Override
    public void loadContent(){
		Log.info("Loading some example content.");
    }

}
