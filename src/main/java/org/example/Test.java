package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tbl_admin_info")
public class Test {

    @Id
    private Long    id;                 // 관리자 고유 번호
    private String  userId;             // 관리자 아이디
    private String  userName;           // 관리자 명
    private String  userPassword;       // 관리자 비밀번호
    private Long    userPermissionId;   // 관리자 권한 아이디
    private String  startUseDate;       // 사용 시작일
    private String  endUseDate;         // 사용 종료일
    private String  allowIpYn;          // IP 검사 사용 여부
    private String  allowMacYn;         // MAC 검사 사용 여부
    private String  allowIpAddress;     // 허용 IP 주소
    private String  allowMacAddress;    // 허용 MAC 주소
    private String  deleteYn;           // 삭제 여부
    private Long    registerUserSeq;    // 등록자 고유 번호
    private String  registerDate;       // 등록일자
    private Long    updateUserSeq;      // 수정자 고유 번호
    private String  updateDate;         // 수정일자
    private String  uuidInformation;    // UUID 정보
    private Long    userGroupId;        // 관리자 그룹 아이디
    private Long    loginFailCnt;       // 로그인 실패 횟수
    private String  loginAllowTime;     // 로그인 허용 시간
    private String  lockYn;             // 잠금 여부
    private String  defaultPasswordYn;  // 기본 패스워드 여부


    @Builder
    public Test(Long id, String userId, String userName, String userPassword, Long userPermissionId, String startUseDate, String endUseDate, String allowIpYn, String allowMacYn, String allowIpAddress, String allowMacAddress, String deleteYn, Long registerUserSeq, String registerDate, Long updateUserSeq, String updateDate, String uuidInformation, Long userGroupId, Long loginFailCnt, String loginAllowTime, String lockYn, String defaultPasswordYn, boolean isCreateMode) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPermissionId = userPermissionId;
        this.startUseDate = startUseDate;
        this.endUseDate = endUseDate;
        this.allowIpYn = allowIpYn;
        this.allowMacYn = allowMacYn;
        this.allowIpAddress = allowIpAddress;
        this.allowMacAddress = allowMacAddress;
        this.deleteYn = deleteYn;
        this.registerUserSeq = registerUserSeq;
        this.registerDate = registerDate;
        this.updateUserSeq = updateUserSeq;
        this.updateDate = updateDate;
        this.uuidInformation = uuidInformation;
        this.userGroupId = userGroupId;
        this.loginFailCnt = loginFailCnt;
        this.loginAllowTime = loginAllowTime;
        this.lockYn = lockYn;
        this.defaultPasswordYn = defaultPasswordYn;
    }

}
