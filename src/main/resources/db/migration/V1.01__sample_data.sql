INSERT INTO サンプル.アクション
    (管理番号, 名称)
VALUES
   ('C71EF0', '最初のアクション')
    ;

-- 定義
INSERT INTO 商品.種類
  (種類)
VALUES
  ('プラスチック'),
  ('木')
  ;

INSERT INTO 商品.特徴
    (特徴)
VALUES
    ('専用培養土'),
    ('肥料'),
    ('PH調整剤')
    ;

-- 商品
INSERT INTO 商品.栽培キット
    (キット番号, 種まき日, カバー, 種類)
VALUES
   ('PN-X123-Y9', CURRENT_DATE - 10, '無', 'プラスチック')
    ;

INSERT INTO 商品.キットの特徴
  (キット番号,順序番号,特徴)
VALUES
  ('PN-X123-Y9',1, '肥料'),
  ('PN-X123-Y9',2, 'PH調整剤')
  ;
