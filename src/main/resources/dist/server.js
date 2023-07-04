"use strict";

var express = require('express');
var path = require('path');
var _require = require('url'),
  fileURLToTPath = _require.fileURLToTPath;
var app = express();
app.use(express["static"](__dirname + '/public'));
app.get("/", function (req, res) {
  var htmlContent = "<form id=\"form\">\n\tPlease enter your name and pick the Sectors you are currently involved in.\n\t<br />\n\t<br />\n\t<label for=\"name\">Name:</label>\n\t<input id=\"name\" type=\"text\" />\n\t<input type=\"button\" onclick=\"checkValue()\" value=\"check name\"/>\n\t<br />\n\t<br />\n\t<label for=\"sectors\">Sectors:</label>\n\t<select id=\"sectors\" multiple=\"\" size=\"5\">\n\t\n\t<br />\n\t<br />\n\n\t<input id=\"terms\" type=\"checkbox\" /> Agree to terms\n\n\t<br />\n\t<br />\n\t<input id=\"save\" type=\"submit\" value=\"Submit\" />\n</form>";
  var html = "\n  <!DOCTYPE html>\n\t<head>\n\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\n\t\t<script type=\"module\" src=\"./index.js\" ></script>\n\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js\"></script>\n\t</head>\n\t<body>\n\t\t<div id=\"app\">".concat(htmlContent, "</div>\n\t</body>\n  </html>");
  res.send(html);
});
var port = 3000;
app.listen(port, function () {
  console.log("Server is running on localhost:".concat(port));
});