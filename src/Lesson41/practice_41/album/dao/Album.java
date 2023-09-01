package Lesson41.practice_41.album.dao;

import Lesson41.practice_41.album.model.Photo;

import java.time.LocalDate;

public interface Album {
    boolean addPhoto(Photo photo);
    boolean removePhoto(int photoId,int albumId);
    boolean updatePhoto(int photoId,int albumId,String url);
    Photo getPhotoFromAlbum(int photoId, int albumId);
    Photo[] getAllPhotoFromAlbum(int albumId);
    Photo[] getPhotoBeetwenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();
}
