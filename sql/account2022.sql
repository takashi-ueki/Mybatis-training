DROP TABLE IF EXISTS accounts;  --このテーブルを一度クリア

CREATE TABLE accounts
(
    id int unsigned AUTO_INCREMENT,
    dt date,　              --日付を記述
    inc_exp char(2),        --”収入”か”支出”か空白のみとする
    category varchar(20),  --カテゴリを記述。空白は許容しておく
    amount int,              --金額を記入。空白は許容。
    PRIMARY KEY(id)
);

INSERT INTO accounts (id, dt, inc_exp, category, amount) VALUES (1, '22-09-01', "支出", "交通費", 780);
INSERT INTO accounts (id, dt, inc_exp, category, amount) VALUES (2, '22-09-02', "支出", "食費", 1280);
INSERT INTO accounts (id, dt, inc_exp, category, amount) VALUES (3, '22-09-03', "支出", "食費", 980);
INSERT INTO accounts (id, dt, inc_exp, category, amount) VALUES (4, '22-09-04', "支出", "日用品", 4580);
INSERT INTO accounts (id, dt, inc_exp, category, amount) VALUES (5, '22-09-02', "収入", "給与", 4000);