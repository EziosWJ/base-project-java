package cn.ezios.baseapi.modules.auth.session;

import cn.ezios.baseapi.modules.system.user.entity.SysUser;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class LoginUserSession implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String nickname;

    private String avatar;

    private String phone;

    private String email;

    private Long deptId;

    private String loginIp;

    private LocalDateTime loginTime;

    public static LoginUserSession from(SysUser user, String loginIp, LocalDateTime loginTime) {
        LoginUserSession session = new LoginUserSession();
        session.setId(user.getId());
        session.setUsername(user.getUsername());
        session.setNickname(user.getNickname());
        session.setAvatar(user.getAvatar());
        session.setPhone(user.getPhone());
        session.setEmail(user.getEmail());
        session.setDeptId(user.getDeptId());
        session.setLoginIp(loginIp);
        session.setLoginTime(loginTime);
        return session;
    }
}
