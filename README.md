# SpringbootDemo

SpringBoot+MyBatis+SQLServer2012


■src/main/resources/application.yml
自分のデータベース設定にあわせて修正すること

-----------------------------------
 url: jdbc:sqlserver://127.0.0.1:1433;DatabaseName=MYDB
 username: sa
 password: password
-----------------------------------

DemoApplication.javaをjavaアプリケーションとして実行して、コンソールに以下のメッセージが表示されたら
正常に起動できている。

-----------------------------------
Tomcat started on port(s): 8080 (http) with context path ''
Started DemoApplication in 3.983 seconds (JVM running for 5.267)
-----------------------------------

ブラウザを立ち上げて、以下のURLを入力して
http://localhost:8080/testboot/getuser

テーブルUsersにあるデータが表示される。

テーブルUsersはSqlServerにて事前に作成する必要ある。
create table users(
id int,
name char(10)
)
