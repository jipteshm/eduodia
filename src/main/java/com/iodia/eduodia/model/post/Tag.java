package com.iodia.eduodia.model.post;

import javax.persistence.Entity;

import com.iodia.eduodia.model.EduEntity;

@Entity
public class Tag extends EduEntity
{

    private static final long serialVersionUID = 1L;

    private long id;

    private String name;

    private boolean active;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

}
