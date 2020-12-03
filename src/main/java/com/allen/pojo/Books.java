package com.allen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Allen
 * @date 2020/12/2 15:18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookId;
    private String bookName;
    private int bookCounts;
    private String detail;
}
