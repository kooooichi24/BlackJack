# 作業ログを記載
## Step1. 雛形作成
- project 作成
- main class 作成
- README.md 作成
- mainクラスでhello world実行
## Step2. 52枚のトランプ作成
- 準備するクラス
    - 1枚のCardクラス 
        - 記号, 数字, 点数
    - 52枚のカードをまとめたDeckクラス
        - (初期化ダサすぎて泣ける)
            - 全カードの状態をDeckクラスで記載しているのがダサい
            - enumを用いてCardクラスをCard enumに変更する
                - enumのコンストラクタはprivateのみ、と見かけるが、どこの情報参照してる？
- とりあえず考えつく必要な機能
    - Deckのシャッフル
    - Deckからカードドロー
    - Deckからカード削除
## Step3. 