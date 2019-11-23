package com.example.musicback.config;

import com.example.musicback.pojo.Song;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;
import java.util.List;

/**
 * @author haya
 */
@Configuration
public class Config {
    @Bean
    public List<Song> songList() {
        LinkedList<Song> list = new LinkedList<>();
        list.add( new Song() {{
            setId( 1 );
            setName( "超能力" );
        }} );
        for (int i = 1; i < 10; i++) {
            int j = i;
            list.add( new Song() {{
                setId( j );
                setName( String.valueOf( j ) );
            }} );
        }
        return list;
    }
}
