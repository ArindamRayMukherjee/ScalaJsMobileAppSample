import React from 'react';

let app;
// if (__DEV__) {
//   app = require("./target/scala-2.13/app-fastopt/main.js").app;
// } else {
app = require("./target/scala-2.13/app-opt/main.js").app;
// }

export default app;
