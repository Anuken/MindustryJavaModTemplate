package com.ceddie.skirmishai.core;

import arc.struct.Seq;
import mindustry.game.Team;

public final class AIRegistry {

    private static final Seq<SkirmishAIController> controllers =
        new Seq<>();

    private AIRegistry() {
    }

    public static void register(Team team) {
        if (team == null || get(team) != null) {
            return;
        }

        controllers.add(new SkirmishAIController(team));
    }

    public static SkirmishAIController get(Team team) {
        for (SkirmishAIController controller : controllers) {
            if (controller.getTeam() == team) {
                return controller;
            }
        }

        return null;
    }

    public static void unregister(Team team) {
        SkirmishAIController controller = get(team);

        if (controller != null) {
            controllers.remove(controller, true);
        }
    }

    public static void update(float delta) {
        if (delta <= 0f) return;

        for (SkirmishAIController controller : controllers) {
            controller.update(delta);
        }
    }

    public static void clear() {
        controllers.clear();
    }

    public static int size() {
        return controllers.size;
    }
}