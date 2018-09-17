// @GENERATOR:play-routes-compiler
// @SOURCE:/root/conf/routes
// @DATE:Mon Sep 17 09:12:32 UTC 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
