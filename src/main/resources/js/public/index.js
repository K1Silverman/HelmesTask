

document.addEventListener('DOMContentLoaded', function () {
  console.log("loaded");
	console.log("doc: " + JSON.stringify(document));


	const form = $("#form");
	const nameField = $("#name");
	const sectorsBox = $("#sectors");
	
	$.ajax({
		url: "http://localhost:8080/sectors",
		method: "GET",
		dataType: "json",
		success: function(response) {
			console.log(response);
				response.forEach(sector => {
					let sectorText = "    ".repeat(sector.level - 1) + sector.sectorName;
					sectorsBox.append($("<option>", {
						value: sector.sectorId,
						text: sectorText
					}))
				});
			console.log(sectorsBox);

			sectorsBox.append($('<option>', {
				value: sectorsBox[0].sectorId,
				text: sectorsBox[0].sectorName
			}));

			
		},
		error: function(xhr, status, error) {
			console.error("FAIL. Err: ", error);
		}
	})

});
