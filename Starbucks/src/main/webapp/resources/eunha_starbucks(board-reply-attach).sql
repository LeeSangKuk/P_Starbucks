USE starbucks;

-- 게시판 테이블
CREATE TABLE sb_board(
	bno INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    content TEXT,
    writer VARCHAR(10),
    regdate DATETIME DEFAULT NOW(),
    cnt INT DEFAULT 0
);

SELECT * FROM sb_board;

-- 댓글 테이블
CREATE TABLE sb_reply(
	rno INT AUTO_INCREMENT PRIMARY KEY, -- 댓글번호
    bno INT NOT NULL, -- 게시글번호(게시판번호)
    reply VARCHAR(1000), -- 댓글내용
    replyer VARCHAR(10), -- 댓글작성자
    replydate DATETIME DEFAULT NOW()-- 댓글작성일자
);

SELECT * FROM sb_reply;

INSERT INTO sb_board(title,content,regdate) VALUES('안녕','내용입니다',now());

-- 파일 첨부 기능 테이블
CREATE TABLE sb_attach(
	uuid VARCHAR(100) PRIMARY KEY,
    uploadpath VARCHAR(100),
    filename VARCHAR(100),
    image INT,
    bno INT
);

SELECT * FROM sb_attach;