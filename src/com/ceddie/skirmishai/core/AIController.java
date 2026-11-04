package com.ceddie.skirmishai.core;

import mindustry.game.Team;

public class SkirmishAIController {

    private final Team team;

    private float elapsedTime;

    public SkirmishAIController(Team team) {
        if (team == null) {
            throw new IllegalArgumentException(
                "AI team cannot be null."
            );
        }

        this.team = team;
    }

    public void update(float delta) {
        elapsedTime += delta;

        // Future subsystem updates:
        //
        // Intelligence
        // Strategy
        // Economy
        // Construction
        // Defense
        // Military
    }

    public Team getTeam() {
        return team;
    }

    public float getElapsedTime() {
        return elapsedTime;
    }
}