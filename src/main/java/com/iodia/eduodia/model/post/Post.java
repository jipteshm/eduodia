package com.iodia.eduodia.model.post;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.iodia.eduodia.model.EduEntity;
import com.iodia.eduodia.model.post.enums.PostType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Post")
@ApiModel(description = "All details about the Posts. ")
public class Post extends EduEntity
{

    private static final long serialVersionUID = 1L;

    @NotBlank
    @ApiModelProperty(notes = "The title of the post. mandatory")
    private String title;

    @NotBlank
    @ApiModelProperty(notes = "The content of the post.")
    private String content;

    @Column
    @ApiModelProperty(notes = "Gets the post either question or answer or comment or reply.")
    private PostType postType;

    @Column
    @ApiModelProperty(notes = "The number of likes of a post.")
    private long likes;

    @Column
    @ApiModelProperty(notes = "The number of views.")
    private long views;

    @Column
    private boolean validated;

    @Column
    private boolean active;

    @Column
    private Post parent;

    @Column
    private Forum forum;

    @Column
    private long item;

    @Column
    private String uuid;

    @OneToMany
    @JoinTable(name = "Post_Tag", joinColumns = @JoinColumn(name = "post_id"), inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tags = new ArrayList<>();

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public PostType getPostType()
    {
        return postType;
    }

    public void setPostType(PostType postType)
    {
        this.postType = postType;
    }

    public long getLikes()
    {
        return likes;
    }

    public void setLikes(long likes)
    {
        this.likes = likes;
    }

    public boolean isValidated()
    {
        return validated;
    }

    public void setValidated(boolean validated)
    {
        this.validated = validated;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

    public Post getParent()
    {
        return parent;
    }

    public void setParent(Post parent)
    {
        this.parent = parent;
    }

    public Forum getForum()
    {
        return forum;
    }

    public void setForum(Forum forum)
    {
        this.forum = forum;
    }

    public long getItem()
    {
        return item;
    }

    public void setItem(long item)
    {
        this.item = item;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    public List<Tag> getTags()
    {
        return tags;
    }

    public void setTags(List<Tag> tags)
    {
        this.tags = tags;
    }

}
