//hello pls no bugs

package com.ceddie.skirmishai.debug;

import arc.util.Log;
import com.ceddie.skirmishai.core.AIRegistry;

public final class AIDebug {

    private AIDebug() {
    }

    public static void printRegistry() {
        Log.info(
            "[Skirmish AI] Active controllers: @",
            AIRegistry.size()
        );
    }

    public static void log(String message) {
        Log.info("[Skirmish AI] @", message);
    }

    public static void warn(String message) {
        Log.warn("[Skirmish AI] @", message);
    }
}