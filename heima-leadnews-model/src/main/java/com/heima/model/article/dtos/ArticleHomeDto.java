package com.heima.model.article.dtos;

import lombok.Data;

import java.util.Date;

/**
 * @author unique
 */
@Data
public class ArticleHomeDto {

    /**
     * 最大时间
     */
    Date maxBehotTime;

    /**
     * 最小时间
     */
    Date minBehotTime;

    /**
     * 分页大小
     */
    Integer size;

    /**
     * 频道id
     */
    String tag;

}
