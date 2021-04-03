Feature:
 This setup is aim for online (have Internet access) or offline (no Internet access) use. 
 
 Prerequisite:
 Java
 Ant
 Maven
 
 At initial setup, Internet access is required for the first time to setup in required libs. Later then on, 
 Internet connection is not required in the time of development.
 
 
 Step 1:
 run this to copy mvn managed libs to lib/
 ant copy-mvn-lib 
 
 Step 2:
 For online use, just keep using the maven for project management.
 For offline use, use ant as the build tools.
 run this to read help message.
 ant help 
 