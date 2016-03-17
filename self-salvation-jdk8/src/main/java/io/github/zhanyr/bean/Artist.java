package io.github.zhanyr.bean;


import java.util.List;

/**
 * @Author zhanyr
 * @Create 2016-03-16 下午5:48
 * @Desc 乐队
 */
public class Artist {
    /**
     * 乐队名字
     */
    private String name;
    /**
     * 成员
     */
    private List<String> members;
    /**
     * 来自哪里
     */
    private String origin;
    /**
     * 专辑
     */
    private List<Album> albums;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}