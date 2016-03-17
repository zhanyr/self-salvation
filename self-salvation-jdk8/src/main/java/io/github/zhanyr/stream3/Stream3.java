package io.github.zhanyr.stream3;

import io.github.zhanyr.bean.Artist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author zhanyr
 * @Create 2016-03-16 下午6:45
 * @Desc
 */
public class Stream3 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Stream3.class);

    public static void main(String[] args) {
        Stream3 stream3 = new Stream3();
        stream3.studyStream();

    }

    private void studyStream(){
        Artist artist1 = new Artist();
        artist1.setOrigin("london");
        Artist artist2 = new Artist();
        artist2.setOrigin("china");
        Artist artist3 = new Artist();
        artist3.setOrigin("london");
        List<Artist> artists = new ArrayList<>();
        artists.add(artist1);
        artists.add(artist2);
        artists.add(artist3);
        long count = artists.stream().filter(artist -> "london".equals(artist.getOrigin())).count();
        System.out.println(count);
        boolean allMatch = artists.stream().allMatch(artist -> "london".equals(artist.getOrigin()));
        System.out.println(allMatch);
        boolean anyMatch = artists.stream().anyMatch(artist -> "london".equals(artist.getOrigin()));
        System.out.println(anyMatch);
        long count1 = artists.stream().count();
        System.out.println(count1);
        Stream<Artist> distinct = artists.stream().distinct();
        System.out.println(distinct.findFirst().get().getOrigin());
        List<Artist> collect = artists.stream().collect(Collectors.toList());
        System.out.println(collect);
        List<String> collect1 = artists.stream().map(artist -> {artist.setName("hhe");return artist.getName();}).collect(Collectors.toList());
        System.out.println(collect1);
        List<Artist> collect2 = artists.stream().filter(artist -> "london".equals(artist.getOrigin())).collect(Collectors.toList());
        System.out.println(collect2);
        Artist artist4 = artists.stream().min(Comparator.comparing(artist -> artist.getOrigin().length())).get();
        System.out.println(artist4);

    }
}

