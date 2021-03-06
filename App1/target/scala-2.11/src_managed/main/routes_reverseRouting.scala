// @SOURCE:/home/vivek/STSProjectsImports/SamplePlay/App1/conf/routes
// @HASH:dcd499243cf136887a6ac3f40bf3e8735db95c96
// @DATE:Mon Jun 25 18:08:13 IST 2018

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:10
// @LINE:7
// @LINE:4
// @LINE:2
package controllers {

// @LINE:4
class ReverseSumController {


// @LINE:4
def socket(password:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "sum/" + implicitly[PathBindable[String]].unbind("password", dynamicString(password)))
}
                        

}
                          

// @LINE:10
class ReverseFirstController {


// @LINE:10
def sayHello(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "helloUser")
}
                        

}
                          

// @LINE:7
class ReverseAssets {


// @LINE:7
def versioned(file:Asset): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
}
                        

}
                          

// @LINE:2
class ReverseApplication {


// @LINE:2
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:10
// @LINE:7
// @LINE:4
// @LINE:2
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:4
class ReverseSumController {


// @LINE:4
def socket : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SumController.socket",
   """
      function(password) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sum/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("password", encodeURIComponent(password))})
      }
   """
)
                        

}
              

// @LINE:10
class ReverseFirstController {


// @LINE:10
def sayHello : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FirstController.sayHello",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "helloUser"})
      }
   """
)
                        

}
              

// @LINE:7
class ReverseAssets {


// @LINE:7
def versioned : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.versioned",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:2
class ReverseApplication {


// @LINE:2
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:10
// @LINE:7
// @LINE:4
// @LINE:2
package controllers.ref {


// @LINE:4
class ReverseSumController {


// @LINE:4
def socket(password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SumController.socket(password), HandlerDef(this.getClass.getClassLoader, "", "controllers.SumController", "socket", Seq(classOf[String]), "GET", """""", _prefix + """sum/$password<[^/]+>""")
)
                      

}
                          

// @LINE:10
class ReverseFirstController {


// @LINE:10
def sayHello(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FirstController]).sayHello(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FirstController", "sayHello", Seq(), "GET", """""", _prefix + """helloUser""")
)
                      

}
                          

// @LINE:7
class ReverseAssets {


// @LINE:7
def versioned(path:String, file:Asset): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.versioned(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[Asset]), "GET", """ Use `Assets.versioned` to enable Play 2.3's Asset Fingerprinting""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:2
class ReverseApplication {


// @LINE:2
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

}
                          
}
        
    