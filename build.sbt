name := "GettingStartedWithScalaJS"
version := "0.1"
scalaVersion := "2.13.3"

// ScalaJS
scalaJSUseMainModuleInitializer := true      // this is an application with a main method
mainClass in Compile := Some("hello.Hello4") // start with the `main` in Hello2
enablePlugins(ScalaJSPlugin)

// DOM
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"

// jQuery
enablePlugins(JSDependenciesPlugin)
libraryDependencies += "org.querki" %%% "jquery-facade" % "2.0"
jsDependencies += "org.webjars" % "jquery" % "3.5.1" / "3.5.1/jquery.js"

// Li Haoyi Scalatags project
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.9.2"