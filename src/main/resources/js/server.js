

const express = require('express');
const path = require('path');
const { fileURLToTPath } = require('url');

const app = express();

app.use(express.static(__dirname + '/public'));

app.get("/", (req, res) => {

	const htmlContent = `<form id="form">
	Please enter your name and pick the Sectors you are currently involved in.
	<br />
	<br />
	<label for="name">Name:</label>
	<input id="name" type="text" />
	<input id="checkNameButton" type="button" value="check name"/>
	<br />
	<br />
	<label for="sectors">Sectors:</label>
	<select id="sectors" multiple="" size="5">
	
	<br />
	<br />

	<input id="terms" type="checkbox" /> Agree to terms

	<br />
	<br />
	<input id="save" type="submit" value="Submit" />
</form>`
	const html = `
  <!DOCTYPE html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
		<script type="module" src="./index.js" ></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
	</head>
	<body>
		<div id="app">${htmlContent}</div>
	</body>
  </html>`;
	res.send(html);
});

const port = 3000;

app.listen(port, () => {
	console.log(`Server is running on localhost:${port}`);
});
