<script src="../json/korea.json" type="text/javascript"></script>



function getData() {
	let jsonData = JSON.parse(JSON.stringify(data));
	console.log(jsonData);
	console.log("");
	console.log("");

	console.log("[main] : [name] : " + jsonData.name);
	console.log("[main] : [base_year] : " + jsonData.base_year);
	console.log("[main] : [name_eng] : " + jsonData.name_eng);
	console.log("[main] : [code] : " + jsonData.code);

}


