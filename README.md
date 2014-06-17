TDDBC for Scala with ScalaTest with sbt
====================================

これは、ScalaTestとsbtを使ったScalaプロジェクトテンプレートです。

## 動作環境

* JDK7
 * おそらくJDK6でも動作します

## ビルド&テストの実行

同梱のsbtを使います。

```bash
./sbt test
```

または 

```bash
make test
```

## tips

* テストコードのサンプルは: ./src/test/scala/samples/scalatest.scala 
* Makefileを見ると、何かのヒントがあるかもしれません。

## 参考

* [Scala](http://www.scala-lang.org/)
* [ScalaTest](http://www.scalatest.org/)
* [sbt](http://www.scala-sbt.org/)

## ライセンス

Apache License, Version 2.0です。
詳しくはプロジェクト直下の `LICENSE` をご覧ください。

同梱している sbt は、 sbt のライセンスに従います。
詳しくは `tools/sbt/jansi-license.txt` をご覧ください。

