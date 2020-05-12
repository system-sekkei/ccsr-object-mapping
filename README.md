# CCSR オブジェクトマッピング
CCSR(Continuous Concurrent Stepwise Refinement)手法を学ぶための参照プロジェクトの一つです。  
このプロジェクトは、実装面、特にオブジェクトと画面・テーブル・JSONデータとのマッピングのやり方を中心にしたサンプルアプリケーションです。

## CCSR手法
CCSR手法は、ソフトウェアのもっとも重要な品質は発展性であるという考え方に基づく開発手法です。  

#### 基本コンセプト
- 要件定義・仕様化・実装の**継ぎ目をなくす**
- **ビジネスロジック**に焦点を合わせる
- **型によるモジュール構造**を基本にする

#### CCSR手法の特徴
- 要件定義手法として、要件の**関係性**・その**可視化**・関係者の**合意形成**を重視したRDRA手法を使用
- **ソフトウェア仕様を記述**する方法として、プログラミング言語(Java)による記述、JIGによる可視化、IDE IntelliJ IDEAを活用
- アーキテクチャとして**三層＋ドメインロジック**を採用
- 実装技術としてSpring MVC, Thymeleaf, MyBatisを使用

#### 参考資料
- 記事：[ソフトウェアのもっとも重要な品質は発展性](https://masuda220.hatenablog.com/entry/2020/04/05/172125) (2020/4/5)
- スライド：[ドメイン駆動設計 15年の取り組みでわかったこと](https://www.slideshare.net/masuda220/ss-231096753) (2020/3/30)
- YouTube：[RDRA2.0のサンプルをJIGで実装してみたよ](https://www.youtube.com/watch?v=Jf8y5fd9OhM&feature=youtu.be) (2020/4/30)

## このサンプルの利用方法
```>./gradlew bootRun```でアプリケーションを起動し、ブラウザで```localhost:8080```を開いてください。  
- アプリケーションの紹介
- オブジェクトマッピングの概要
- アプリケーション画面へのリンク
- データベース管理画面へのリンク
- APIドキュメントへのリンク

などのオンラインドキュメントをご覧いただけます。  
Javaを使ったアプリケーション開発の経験者を対象に、Spring MVCとMyBatisを使った、オブジェクトと画面・テーブル・JSONデータの
マッピングのやり方の参考情報を提供します。

### オブジェクトとのマッピング技術
以下の3領域のマッピングの実装例です。
* オブジェクト ⇔ HTML(画面)
* オブジェクト ⇔ JSON(Web API)
* オブジェクト ⇔ SQL(テーブル)

### アーキテクチャ
レイヤ構造は **三層＋ドメインロジック** です。
<details>
<summary><code>application/</code> アプリケーション層</summary>
 <ul>
 <li><code>coordinator/</code> 複合サービス</li>
 <li><code>repository/</code> リポジトリ定義</li>
 <li><code>service/</code> 要素サービス</li>
 </ul>
</details>
<details>
 <summary><code>domain/</code> ドメインロジック</summary>
 <ul>
 <li><code>model/</code> モデル</li>
 <li><code>type/</code> 基本型</li>
 </ul>
</details>
<details>
 <summary><code>infrastructure/</code> インフラストラクチャ層</summary>
 <ul>
 <li><code>_configuration/</code> ← 設定</li>
 <li><code>datasource/</code> データソース</li>
 <li><code>transfer/</code> 通信</li>
 </ul>
</details>
<details>
 <summary><code>presentation/</code> プレゼンテーション層</summary>
 <ul>
 <li><code>api/</code> API RESTコントローラ</li>
 <li><code>web/</code> 画面コントローラ</li>
 </ul>
</details>
  
### 要素技術
* 全体 ： Spring Boot , Gradle
* プレゼンテーション層 ： Spring MVC, Thymeleaf
* データソース層とデータベース ： MyBatis, Flyway, H2 Database Engine
* ドキュメント生成 ： JIG

詳細は、オンラインのドキュメント（```localhost:8080```で表示）とソースコードを参考にしてください。