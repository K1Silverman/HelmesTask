const express = require('express');
const path = require('path');
const { fileURLToTPath } = require('url');

const app = express();
app.set('view engine', 'ejs');
app.use(express.static(__dirname + '/public'));
app.use(express.urlencoded({ extended: true}));

app.get("/", (req, res) => {
	res.render('index')
});

const port = 3000;

app.listen(port, () => {
	console.log(`Server is running on localhost:${port}`);
});
