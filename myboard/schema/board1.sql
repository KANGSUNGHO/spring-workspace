-- 보드
DROP TABLE IF EXISTS `board` RESTRICT;

-- 보드
CREATE TABLE `board` (
	`seq`     INT UNSIGNED  NOT NULL COMMENT '번호', -- 번호
	`title`   VARCHAR(200)  NULL     COMMENT '제목', -- 제목
	`writer`  VARCHAR(20)   NULL     COMMENT '작성자', -- 작성자
	`content` VARCHAR(2000) NULL     COMMENT '내용', -- 내용
	`regdate` DATETIME      NULL     DEFAULT SYSDATE COMMENT '작성일', -- 작성일
	`cnt`     INT UNSIGNED  NULL     DEFAULT 0 COMMENT '조회수' -- 조회수
)
COMMENT '보드';

-- 보드
ALTER TABLE `board`
	ADD CONSTRAINT `PK_board` -- 보드 기본키
		PRIMARY KEY (
			`seq` -- 번호
		);