document.addEventListener("DOMContentLoaded", function () {
	const form = $("#form");
	const nameField = $("#name");
	const sectorsBox = $("#sectors");
	const termsBox = $("#terms");

	$.ajax({
		url: "http://localhost:8080/sectors",
		method: "GET",
		dataType: "json",
		success: function (response) {
			response.forEach((sector) => {
				let sectorText = "    ".repeat(sector.level - 1) + sector.sectorName;
				sectorsBox.append(
					$("<option>", {
						value: sector.sectorId,
						text: sectorText,
					})
				);
			});
		},
		error: function (xhr, status, error) {
			console.error("FAIL. Err: ", error);
		},
	});

	if(sessionStorage.length > 0) {
		nameField.val(sessionStorage.getItem("name"));
		let sectors = sessionStorage.getItem("sectors").split(",").map(Number);
		sectorsBox.val("1").prop("selected", true);

		for (let i = 0; i < sectors.length; i++) {
			
			console.log(String(sectors[i]));
			sectorsBox.val(sectors[i]).prop("selected", true);
			console.log(sectorsBox.val(String(sectors[i])).len);
		}
		termsBox.val(sessionStorage.getItem("terms"));
	} 

	form.on("submit", (event) => {
		if (sessionStorage.length == 0) {
			sessionStorage.setItem("name", nameField.val());
			sessionStorage.setItem("sectors", sectorsBox.val());
			sessionStorage.setItem("terms", termsBox.val());

			$.ajax({
				url: "localhost:8080/submit/new",
				method: "POST",
				dataType: "json",
				data: {
					"name": sessionStorage.getItem("name"),
					"sectors": sessionStorage.getItem("sectors"),
					"terms": sessionStorage.getItem("terms")
				}
			}).success(function () {
					alert("Submited to database");
				}).fail(function() {
					alert("Something went wrong, check your inputs");
				});
		} else {
			
		}
	});
});
