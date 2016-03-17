package io.github.zhanyr.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @Author zhanyr
 * @Create 2016-03-16 下午5:53
 * @Desc 专辑
 */
public class Album {
    private static final Logger LOGGER = LoggerFactory.getLogger(Album.class);

    /**
     * 专辑名称
     */
    private String name;
    /**
     * 专辑曲目列表
     */
    private List<String> musicList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<String> musicList) {
        this.musicList = musicList;
    }
}