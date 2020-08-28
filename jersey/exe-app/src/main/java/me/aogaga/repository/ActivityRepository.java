package me.aogaga.repository;

import me.aogaga.model.Activity;

import java.util.List;

public interface ActivityRepository {
    List<Activity> findAllActivities();
}
