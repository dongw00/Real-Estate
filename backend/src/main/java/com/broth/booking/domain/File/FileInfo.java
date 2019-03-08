package com.broth.booking.domain.File;

import com.broth.booking.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class FileInfo extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String file_name;

    @Column(nullable = false)
    private String save_file_name;

    @Column(nullable = false)
    private String content_type;

    @Column(nullable = false)
    private boolean delete_flag;

    @Builder
    public FileInfo(String file_name, String save_file_name, String content_type) {
        this.file_name = file_name;
        this.save_file_name = save_file_name;
        this.content_type = content_type;
    }

}
