package cn.geekview.entity.repository;

import cn.geekview.entity.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser,Long> {
    SysUser findByUsername(String username);
}
