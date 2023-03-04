## Building and running

### Building the app
Once you've created your project :
Firstly, install all the JS/TS dependencies with `yarn`
Secondly compile your Scala code to JavaScript by running the following in the sbt shell
```
> clean; fullLinkJS
```
or on the command line
```
$ sbt clean fullLinkJS
```
Use `fastLinkJS` below for a debug build (also enable some commented code in App.js)
IMP: this might refresh new react components but will not refresh new code written inside functions 
behind existing react components. Use the yarn commands below to stop and redeploy to ios/android 

### Stopping and running
`yarn stop`

`yarn iosQ` for deploying without rebuilding the ios pods or `yarn ios` with a full rebuild

`yarn android`

### Cleaning
`yarn clean`
