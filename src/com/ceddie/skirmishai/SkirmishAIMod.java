package com.ceddie.skirmishai;

import arc.util.Events;
import arc.util.Log;
import arc.util.Time;
import mindustry.game.EventType;
import mindustry.mod.Mod;

import com.ceddie.skirmishai.core.AIRegistry;

public class SkirmishAIMod extends Mod {

    public SkirmishAIMod() {
        Log.info("[Skirmish AI] Constructor initialized.");
    }

    @Override
    public void init() {
        Log.info("[Skirmish AI] Initializing systems...");

        // Reset AI controllers whenever a world loads.
        Events.on(EventType.WorldLoadEvent.class, event -> {
            AIRegistry.clear();

            Log.info("[Skirmish AI] World loaded. Registry reset.");
        });

        // Update registered AI controllers.
        Events.run(EventType.Trigger.update, () -> {
            AIRegistry.update(Time.delta);
        });

        Log.info("[Skirmish AI] Initialization complete.");
    }
}