package org.nero.click.admin.dao;

import org.apache.ibatis.annotations.Param;
import org.click.admin.entity.Link;

import java.util.List;

/**
 * Author :  root
 * Email  :  nerosoft@outlook.com
 * Date   :  16-11-5
 * Time   :  下午7:41
 */
public interface LinkDao {

    /**
     * 添加友情链接
     * @param name
     * @param hrefUrl
     * @return
     */
    int addLink(@Param("name") String name,
                @Param("hrefUrl") String hrefUrl);

    /**
     * 删除友情链接
     * @param id
     * @return
     */
    int delLink(@Param("id") long id);

    /**
     * 获取友情链接
     * @return
     */
    List<Link> getLinks();

}
