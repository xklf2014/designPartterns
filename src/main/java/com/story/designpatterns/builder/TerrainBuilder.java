package com.story.designpatterns.builder;

public interface TerrainBuilder {
    TerrainBuilder buildWall();
    TerrainBuilder buildMine();
    TerrainBuilder buildFort();

    Terrain build();
}
