name := "happy_hour"
 
version := "1.0" 
      
lazy val `happy_hour` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc ,
  ehcache ,
  ws ,
  "org.webjars" %% "webjars-play" % "2.6.3",
  "org.webjars" % "salesforce-lightning-design-system" % "2.5.2",
  specs2 % Test ,
  guice)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      