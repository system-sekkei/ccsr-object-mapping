# template

## 概要

CCSR(Continuous Concurrent Stepwise Refinement)のためのテンプレートプロジェクト

* レイヤ構成
* 要素技術
* オブジェクトと画面・JSON・テーブルとのマッピング
* Jigを活用するための規約

### プロジェクトのレイアウト
<details open>
 <summary>src/main</summary>
<details open>
 <summary>java</summary>
<details open>
 <summary>application　アプリケーション層</summary>
 <ul>
 <li>coordinator ← 複合サービス</li>
 <li>repository ← リポジトリ</li>
 <li>service ← サービス</li>
 </ul>
</details>
<details>
 <summary>domain ドメイン層</summary>
 <ul>
 <li>identity ← 識別情報</li>
 <li>model ← ドメインモデル</li>
 <li>type ← 基本型</li>
 </ul>
</details>
<details>
 <summary>infrastructure インフラストラクチャ層</summary>
 <ul>
 <li>datasource ← データソース</li>
 <li>transfer ← 通信</li>
 </ul>
</details>
<details>
 <summary>presentation プレゼンテーション層</summary>
 <ul>
 <li>api ← API</li>
 <li>web ← 画面</li>
 </ul>
</details>
 <details open>
  <summary>resources</summary>
 </details>
</details>
</details>
  
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