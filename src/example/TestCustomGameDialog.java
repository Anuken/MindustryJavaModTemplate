package example;

import java.lang.reflect.*;
import arc.func.*;
import arc.scene.ui.layout.*;
import mindustry.ui.dialogs.*;
import static mindustry.Vars.*;

public class TestCustomGameDialog {
	public static void init() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
	Field nameFieldInA = CustomGameDialog.class.getDeclaredField("dialog");
        nameFieldInA.setAccessible(true);
        Field nameFieldIB = CustomRulesDialog.class.getDeclaredField("main");
        nameFieldIB.setAccessible(true);
		check((Table)nameFieldIB.get(nameFieldInA.get(ui.custom)), "ss", b -> {}, () -> {return true;}, () -> {return true;});
	}
	
	static void check(Table main, String text, Boolc cons, Boolp prov, Boolp condition){
        main.check(text, cons).checked(prov.get()).update(a -> a.setDisabled(!condition.get())).padRight(100f).get().left();
        main.row();
    }
}
