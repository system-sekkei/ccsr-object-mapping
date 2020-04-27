# CCSR オブジェクトマッピング

CCSR(Continuous Concurrent Stepwise Refinement)のための参照プロジェクトです。

このプロジェクトでは、ドメインオブジェクトとHTML/SQL/JSONとのマッピングの実装例を紹介します。

### 起動方法
```
>./gradlew bootRun
```

### オブジェクトとのマッピング

以下の３つのマッピング技術の実装例です。

* オブジェクト ⇔　HTML
* オブジェクト ⇔ JSON
* オブジェクト ⇔ SQL(テーブル)

アプリケーションを起動して ```http://localhost:8080```をブラウザで開くと実装内容の説明画面が表示されます。

### アーキテクチャ
レイヤ構造は **三層＋ドメインロジック** です。
<details open>
<summary>application　アプリケーション層</summary>
 <ul>
 <li>coordinator ← 複合サービス</li>
 <li>repository ← リポジトリ</li>
 <li>service ← サービス</li>
 </ul>
</details>
<details>
 <summary>domain ドメインロジック</summary>
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
  
### 要素技術

* 全体　：　Spring Boot , Gradle
* プレゼンテーション層　：　Spring MVC, Thymeleaf
* データソース層とデータベース　：　myBatis, flyway, H2Database
