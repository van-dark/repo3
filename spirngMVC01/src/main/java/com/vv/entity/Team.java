package com.vv.entity;

import java.util.List;
import java.util.Map;

public class Team {

    private int teamId;
    private List<User> list;
    private Map<Integer,String> map;

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
