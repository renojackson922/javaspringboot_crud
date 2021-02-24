CREATE TABLE tb_cmm_user (
                             sn          INT(11) NOT NULL AUTO_INCREMENT COMMENT '일련번호',
                             uid         VARCHAR(32),
                             login_id    VARCHAR(30),
                             nm          VARCHAR(30),
                             email       VARCHAR(100),
                             moblphon    VARCHAR(15),
                             birth       DATE,
                             login_cnt   BIGINT,
                             regist_dttm DATETIME,
                             PRIMARY KEY (sn)
);

CREATE TABLE tb_sys_word_dic (
                                 sn                INT(11) NOT NULL AUTO_INCREMENT COMMENT '일련번호',
                                 se                VARCHAR(50) DEFAULT NULL COMMENT '구분',
                                 word_nm           VARCHAR(100) DEFAULT NULL COMMENT '단어 명',
                                 word_nm_en        VARCHAR(100) DEFAULT NULL COMMENT '단어 명 영어',
                                 abrv_nm_en        VARCHAR(100) DEFAULT NULL COMMENT '약어 명 영어',
                                 dfn               mediumtext COMMENT '정의',
                                 theme_relm        VARCHAR(100) DEFAULT NULL COMMENT '주제 영역',
                                 use_at            VARCHAR(1) DEFAULT NULL COMMENT '사용 여부',
                                 frst_regist_dttm  DATETIME DEFAULT NULL COMMENT '최초 등록 일시',
                                 frst_regist_id    VARCHAR(50) DEFAULT NULL COMMENT '최초 등록 아이디',
                                 frst_regist_ip    VARCHAR(50) DEFAULT NULL COMMENT '최초 등록 아이피',
                                 frst_regist_info  VARCHAR(100) DEFAULT NULL COMMENT '최초 등록 정보',
                                 updt_dttm         DATETIME DEFAULT NULL COMMENT '수정 일시',
                                 updt_id           VARCHAR(50) DEFAULT NULL COMMENT '수정 아이디',
                                 updt_ip           VARCHAR(50) DEFAULT NULL COMMENT '수정 아이피',
                                 updt_info         VARCHAR(100) DEFAULT NULL COMMENT '수정 정보',
                                 PRIMARY KEY (sn)
);


