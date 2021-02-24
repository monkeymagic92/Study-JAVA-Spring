CREATE TABLE t_board(
	i_board INT UNSIGNED AUTO_INCREMENT,
	title VARCHAR(30),
	ctnt VARCHAR(1000),
	r_dt DATETIME DEFAULT NOW(),	
	PRIMARY KEY(i_board)
	
);
SELECT * FROM t_board;


INSERT INTO t_board
(title, ctnt)
VALUES
('첫내용', '처글');



