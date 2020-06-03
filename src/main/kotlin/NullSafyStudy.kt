fun main(args: Array<String>) {
    // nullの扱い

    // null許容にしないとnullは代入できない
    //var includeNullNg: String = null

    var includeNullOk: String? = null

    // nullチェックしないとコンパイルエラーになる
    //includeNullOk.length

    if (!includeNullOk.isNullOrEmpty()) {
        // nullチェックするとOKになる。ここではifでチェック
        println(includeNullOk.length)
    }

    // nullじゃなければその後ろの処理を実行するというようにできる
    println(includeNullOk?.length)

    // 最終手段。本当にnullじゃないことを保証する場合はこれでも良いが使わない方針で。
    includeNullOk!!.length

    // エルビス演算子(非nullならincludenullNgが、nullならtestがresultに入る)
    val result = includeNullOk ?: "test"




}