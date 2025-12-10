package com.sharedsync.demo.domain.note;

import com.sharedsync.shared.annotation.CacheEntity;
import com.sharedsync.shared.presence.annotation.PresenceRoot;
import jakarta.persistence.*;

@Entity
@CacheEntity
@PresenceRoot(channel = "note", idField = "id")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;

    private String author;
}
