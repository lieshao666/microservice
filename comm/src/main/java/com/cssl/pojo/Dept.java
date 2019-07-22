package com.cssl.pojo;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * Created by tym on 2019/2/5 0005.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class Dept {

    private Long deptno;
    private String dname;
    private String db;

}
