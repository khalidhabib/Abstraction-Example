package com.khalid.core;

public interface PopulateBeanPropertiesService<T> {
    public <ENTITY>  ENTITY getEntity (T source);
    public <ENTITY> T getDTO(ENTITY entity);
}
