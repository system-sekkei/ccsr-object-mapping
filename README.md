# template

## 概要

CCSR(Continuous Concurrent Stepwise Refinement)のためのテンプレートプロジェクト

* レイヤ構成
* 要素技術
* オブジェクトと画面・JSON・テーブルとのマッピング
* Jigを活用するための規約

### レイヤ構成

<details>
 <summary>application</summary>
  * coordinator
  * repository
  * service 
</details>

* application層
* domain層
  * model
  * type
* infrastructure層
  * datasource
  * transfer
* presentation層
  * api
  * web
  
### 要素技術

* Spring Boot , Gradle
* Spring MVC, Thymeleaf
* myBatis, flyway

### オブジェクトとのマッピング

* オブジェクト ⇔　画面
* オブジェクト ⇔ JSON
* オブジェクト ⇔ SQL(テーブル)

### Jigを活用するための規約

* クラス名、メソッド名、パッケージ名
* Spring アノテーション

## オブジェクトと画面のマッピング

## オブジェクトとJSONのマッピング

## オブジェクトとSQL(テーブル)のマッピング

## Jigを活用するための規約

### ドキュメントとしての価値をあげる

* enumの要素名を日本語に
* スキーマ名・テーブル名・カラム名を日本語
* クラス、メソッド、パッケージに日本語名を付加する

### Java Docコメント　日本語名
### package-info.java の Java Docコメント日本語名