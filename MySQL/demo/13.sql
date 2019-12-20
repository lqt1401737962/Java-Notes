-- 测试MEMORY存储引擎
CREATE TABLE m1(
a VARCHAR(100)
)ENGINE=MEMORY;

-- 测试CSV存储引擎
CREATE TABLE c1(
a VARCHAR(20) NOT NULL,
b VARCHAR(20) NOT NULL
)ENGINE=CSV;
INSERT c1(a,b) VALUES('AAA','BBB');
INSERT c1(a,b) VALUES('CCC','DDD');

-- 测试ARCHIVE存储引擎
CREATE TABLE a1 AS SELECT * FROM INFORMATION_SCHEMA.columns;

INSERT INTO a1 SELECT * FROM a1;

-- 11026432 57177

CREATE TABLE a2 ENGINE=ARCHIVE AS SELECT * FROM a1;

-- 742354 55392

-- 测试MyISAM存储引擎
CREATE TABLE test_myisam(
    a INT UNSIGNED,
    b VARCHAR(20),
    c CHAR(32)
)ENGINE=MyISAM;


CREATE TABLE myisam_1(
a char(30),
id int
)ENGINE=MyISAM;

CREATE TABLE myisam_2(
a VARCHAR(30),
id int
)ENGINE=MyISAM;

CREATE TABLE myisam_3(
a VARCHAR(30),
id int
)ENGINE=MyISAM ROW_FORMAT=FIXED;


CREATE TABLE test_innodb(
 id INT UNSIGNED AUTO_INCREMENT KEY,
 username VARCHAR(20) NOT NULL     
);
