package me.eneas.moviepoll.model;

import java.util.Date;

/**
 * Created by a67281303 on 7/11/16.
 */

public interface DataContract {
    String getTitle();
    Date getReleaseDate();
    Double getPopularity();
    Integer getMyPoints();
    Integer setMyPoints();
}
