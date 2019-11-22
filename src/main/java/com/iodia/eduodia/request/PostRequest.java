package com.iodia.eduodia.request;

import com.iodia.eduodia.model.post.enums.PostType;

public class PostRequest
{

    private String title;

    private String content;

    private PostType postType;

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

}
