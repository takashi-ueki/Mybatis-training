# Mybatis-training
Mybatisを使用してREST APIとDatabaseを連携するレポジトリです。
MySQLの情報をCRUD処理を通じてlocalhostに反映させます。
まずはCreate処理です。（２２／９／７）

##Description
パッケージを以下のように分けて、記述しています。

###Controllerパッケージ
ここにはREST APIに対応するコードを記述します。

###Mapperパッケージ
Databaseに対する処理についてのコードを記述します。

###Serviceパッケージ
ControllerとMapperの間の業務処理に関するコードを記述します。
パッケージの中はInterfaceとそれを実装するクラスで構成されています。
