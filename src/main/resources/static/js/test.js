async function getDatetime(context_root) {
	const targetUrl = context_root + "/index/";
	/*const targetUrl = context_root + "/index/features";*/

	//const targetUrl = "${contextPath}/hospitality/datetimelist";
	let formData = new FormData();

	const options = {
		method: "post",
		body: formData,
	}

	/*
	try {
		let response = await fetch(targetUrl, options);
		let datetimelist = await response.json(); // promise 기본으로 갖고 있는 함수 같은 거
		//console.log(sido_list.value);
		let sel = document.querySelector('#sido_parent'); // 
		for (let item of datetimelist) {
			let option = document.createElement('option');
			option.value = item.datetime_id;
			//option.innerText = item.name;
			sel.append(option);
		}
		//select_option('#sido_parent option', index);
		sel.dispatchEvent(new Event('change'));
	} catch (err) {
		alert(err);
	}
	getMedical(context_root); */
}

async function getSido() {
	let contextPath = document.querySelector('#contextPathHolder').getAttribute('data-contextPath');
	const targetUrl = contextPath + "/query/SidoCodeAll";
	let formData = new FormData();

	const options = {
		method: "post",
		body: formData,
	}
	try {
		let response = await fetch(targetUrl, options);
		let sidolist = await response.json();
		console.log(sidolist);
		//console.log(gugun_list);
		let sel = document.querySelector('#sido_select');
		//deleteOptions(sel);
		for (let item of sidolist) {
			let option = document.createElement('option');
			option.value = item.sidoCodeMK.sidocode;
			option.innerText = item.sidoCodeMK.sidoname;
			sel.append(option);
		}
		//select_option('#sido_child option', index);
		sel.dispatchEvent(new Event('change'));
	} catch (err) {
		alert(err);
	}
	getYear();

}

async function getYear() {
	let contextPath = document.querySelector('#contextPathHolder').getAttribute('data-contextPath');
	const targetUrl = contextPath + "/query/Cov19All/year";
	let formData = new FormData();
	const options = {
		method: "post",
		body: formData,
	}

	try {
		let response = await fetch(targetUrl, options);
		let yearlist = await response.json();
		let sel = document.querySelector('#year_select');
		//deleteOptions(sel);
		for (let item of yearlist) {
			let option = document.createElement('option');
			option.value = item.cov19MK.year;
			option.innerText = item.cov19MK.year;
			sel.append(option);
		}

		//select_option('#sido_child option', index);
		sel.dispatchEvent(new Event('change'));
	} catch (err) {
		alert(err);

	}
}

async function getMonth() {
	let contextPath = document.querySelector('#contextPathHolder').getAttribute('data-contextPath');
	const targetUrl = contextPath + "/query/Cov19Data";
	let formData = new FormData();
	let sido_sel = document.querySelector('#sido_select');
	let sido_code = sido_sel.options[sido_sel.selectedIndex].value;
	let year_sel = document.querySelector('#year_select');
	let year_code = year_sel.options[year_sel.selectedIndex].value;
	if (year_code == null) {
		return;
	}

	formData.append('sidocode', sido_code);
	formData.append('year', year_code);
	const options = {
		method: "post",
		body: formData,
	}
	try {
		let response = await fetch(targetUrl, options);
		let monthlist = await response.json();
		console.log(monthlist);
		//console.log(gugun_list);
		let sel = document.querySelector('#month_select');
		deleteOptions(sel);
		for (let item of monthlist) {
			let option = document.createElement('option');
			option.value = item.value;
			option.innerText = item.cov19MK.month;
			sel.append(option);
		}
		//let selected_value = sel.options[sel.selectedIndex].value;
		//console.log(selected_value);

		//select_option('#sido_child option', index);
		sel.dispatchEvent(new Event('change'));
	} catch (err) {
		alert(err);
	}


}

function setValueToMap() {
	let sel = document.querySelector('#month_select');
	let selected_value = sel.options[sel.selectedIndex].value;
	let sel_city = document.querySelector('#sido_select');
	let sido_value = sel_city.options[sel_city.selectedIndex].innerText;
	//console.log(selected_value);
	changeData(sido_value, selected_value);


}

// -------------------- 복사 붙여넣기 -----------------------------------

async function getSidoEco() {
	let contextPath = document.querySelector('#contextPathHolder').getAttribute('data-contextPath');
	const targetUrl = contextPath + "/query/SidoCodeAll";
	let formData = new FormData();

	const options = {
		method: "post",
		body: formData,
	}
	try {
		let response = await fetch(targetUrl, options);
		let sidolist = await response.json();
		console.log(sidolist);
		//console.log(gugun_list);
		let sel = document.querySelector('#sido_select');
		//deleteOptions(sel);
		for (let item of sidolist) {
			let option = document.createElement('option');
			option.value = item.sidoCodeMK.sidocode;
			option.innerText = item.sidoCodeMK.sidoname;
			sel.append(option);
		}
		//select_option('#sido_child option', index);
		//sel.dispatchEvent(new Event('change'));
	} catch (err) {
		alert(err);
	}
	getYear();

}

async function getYearEco() {
	let contextPath = document.querySelector('#contextPathHolder').getAttribute('data-contextPath');
	const targetUrl = contextPath + "/query/RegionEcoAll/year";
	let formData = new FormData();
	const options = {
		method: "post",
		body: formData,
	}

	try {
		let response = await fetch(targetUrl, options);
		let yearlist = await response.json();
		let sel = document.querySelector('#year_select');
		//deleteOptions(sel);
		for (let item of yearlist) {
			let option = document.createElement('option');
			option.value = item.RegionEconomyMK.year;
			option.innerText = item.RegionEconomyMK.year;
			sel.append(option);
		}

		//select_option('#sido_child option', index);
		sel.dispatchEvent(new Event('change'));
	} catch (err) {
		alert(err);

	}
}

async function getMonthEco() {
	let contextPath = document.querySelector('#contextPathHolder').getAttribute('data-contextPath');
	const targetUrl = contextPath + "/query/RegionEcoData";
	let formData = new FormData();
	let sido_sel = document.querySelector('#sido_select');
	let sido_code = sido_sel.options[sido_sel.selectedIndex].value;
	let year_sel = document.querySelector('#year_select');
	let year_code = year_sel.options[year_sel.selectedIndex].value;
	if (year_code == null) {
		return;
	}

	formData.append('sidocode', sido_code);
	formData.append('year', year_code);
	const options = {
		method: "post",
		body: formData,
	}
	try {
		let response = await fetch(targetUrl, options);
		let monthlist = await response.json();
		console.log(monthlist);
		let sel = document.querySelector('#month_select');
		deleteOptions(sel);
		for (let item of monthlist) {
			let option = document.createElement('option');
			option.value = item.value;
			option.innerText = item.regionEconomyMK.month;
			sel.append(option);
		}
		//let selected_value = sel.options[sel.selectedIndex].value;
		//console.log(selected_value);

		//select_option('#sido_child option', index);
		sel.dispatchEvent(new Event('change'));
	} catch (err) {
		alert(err);
	}


}

// ------------------ 복사 붙여넣기 지역별 고용률 ------------------

async function getSidoEmp() {
	let contextPath = document.querySelector('#contextPathHolder').getAttribute('data-contextPath');
	const targetUrl = contextPath + "/query/SidoCodeAll";
	let formData = new FormData();

	const options = {
		method: "post",
		body: formData,
	}
	try {
		let response = await fetch(targetUrl, options);
		let sidolist = await response.json();
		console.log(sidolist);
		//console.log(gugun_list);
		let sel = document.querySelector('#sido_select');
		//deleteOptions(sel);
		for (let item of sidolist) {
			let option = document.createElement('option');
			option.value = item.sidoCodeMK.sidocode;
			option.innerText = item.sidoCodeMK.sidoname;
			sel.append(option);
		}
		//select_option('#sido_child option', index);
		//sel.dispatchEvent(new Event('change'));
	} catch (err) {
		alert(err);
	}
	getYear();

}

async function getYearEmp() {
	let contextPath = document.querySelector('#contextPathHolder').getAttribute('data-contextPath');
	const targetUrl = contextPath + "/query/RegionEmployAll/year";
	let formData = new FormData();
	const options = {
		method: "post",
		body: formData,
	}

	try {
		let response = await fetch(targetUrl, options);
		let yearlist = await response.json();
		let sel = document.querySelector('#year_select');
		//deleteOptions(sel);
		for (let item of yearlist) {
			let option = document.createElement('option');
			option.value = item.RegionEmploymentMK.year;
			option.innerText = item.RegionEmploymentMK.year;
			sel.append(option);
		}

		//select_option('#sido_child option', index);
		sel.dispatchEvent(new Event('change'));
	} catch (err) {
		alert(err);

	}
}

async function getMonthEmp() {
	let contextPath = document.querySelector('#contextPathHolder').getAttribute('data-contextPath');
	const targetUrl = contextPath + "/query/RegionEmployData";
	let formData = new FormData();
	let sido_sel = document.querySelector('#sido_select');
	let sido_code = sido_sel.options[sido_sel.selectedIndex].value;
	let year_sel = document.querySelector('#year_select');
	let year_code = year_sel.options[year_sel.selectedIndex].value;
	if (year_code == null) {
		return;
	}

	formData.append('sidocode', sido_code);
	formData.append('year', year_code);
	const options = {
		method: "post",
		body: formData,
	}
	try {
		let response = await fetch(targetUrl, options);
		let monthlist = await response.json();
		console.log(monthlist);
		let sel = document.querySelector('#month_select');
		deleteOptions(sel);
		for (let item of monthlist) {
			let option = document.createElement('option');
			option.value = item.value;
			option.innerText = item.regionEmploymentMK.month;
			sel.append(option);
		}
		//let selected_value = sel.options[sel.selectedIndex].value;
		//console.log(selected_value);

		//select_option('#sido_child option', index);
		sel.dispatchEvent(new Event('change'));
	} catch (err) {
		alert(err);
	}


}


// -----------------------------------------------------

function setValueToMap() {
	let sel = document.querySelector('#month_select');
	let selected_value = sel.options[sel.selectedIndex].value;
	let sel_city = document.querySelector('#sido_select');
	let sido_value = sel_city.options[sel_city.selectedIndex].innerText;
	//console.log(selected_value);
	changeData(sido_value, selected_value);

}

function setValueToEcoMap() {
	let sel = document.querySelector('#month_select');
	let selected_value = sel.options[sel.selectedIndex].value;
	let sel_city = document.querySelector('#sido_select');
	let sido_value = sel_city.options[sel_city.selectedIndex].innerText;
	//console.log(selected_value);
	changeData(sido_value, selected_value);
}

function setValueToEmpMap() {
	let sel = document.querySelector('#month_select');
	let selected_value = sel.options[sel.selectedIndex].value;
	let sel_city = document.querySelector('#sido_select');
	let sido_value = sel_city.options[sel_city.selectedIndex].innerText;
	//console.log(selected_value);

	changeData(sido_value, selected_value);
}


/*async function resetData(city, value){
	console.log(city,value);
	
	let sel = null;
		
}*/


async function changeData(city, value) {
	console.log(city, value);

	let sel = null;
	let id_name = null;
	if (city == "강원도") {
		sel = document.querySelector('#label-Gangwon-do');
		id_name = '#label-Gangwon-do';
	} else if (city == "서울특별시") {
		sel = document.querySelector('#label-Seoul');
		id_name = '#label-Seoul'
	} else if (city == "부산광역시") {
		sel = document.querySelector('#label-Busan');
		id_name = '#label-Busan';
	} else if (city == "대구광역시") {
		sel = document.querySelector('#label-Daegu');
		id_name = '#label-Daegu';
	} else if (city == "인천광역시") {
		sel = document.querySelector('#label-Incheon');
		id_name = '#label-Incheon';
	} else if (city == "광주광역시") {
		sel = document.querySelector('#label-Gwangju');
		id_name = '#label-Gwangju';
	} else if (city == "대전광역시") {
		sel = document.querySelector('#label-Daejeon');
		id_name = '#label-Daejeon';
	} else if (city == "울산광역시") {
		sel = document.querySelector('#label-Ulsan');
		id_name = '#label-Ulsan';
	} else if (city == "세종특별자치시") {
		sel = document.querySelector('#label-Sejong');
		id_name = '#label-Sejong';
	} else if (city == "경기도") {
		sel = document.querySelector('#label-Gyeonggi-do');
		id_name = '#label-Gyeonggi-do';
	} else if (city == "충청남도") {
		sel = document.querySelector('#label-Chungcheongnam-do');
		id_name = '#label-Chungcheongnam-do';
	} else if (city == "충청북도") {
		sel = document.querySelector('#label-Chungcheongbuk-do');
		id_name = '#label-Chungcheongbuk-do';
	} else if (city == "경상북도") {
		sel = document.querySelector('#label-Gyeongsangbuk-do');
		id_name = '#label-Gyeongsangbuk-do';
	} else if (city == "경상남도") {
		sel = document.querySelector('#label-Gyeongsangnam-do');
		id_name = '#label-Gyeongsangnam-do';
	} else if (city == "전라북도") {
		sel = document.querySelector('#label-Jeollabuk-do');
		id_name = '#label-Jeollabuk-do';
	} else if (city == "전라남도") {
		sel = document.querySelector('#label-Jeollanam-do');
		id_name = '#label-Jeollanam-do';
	} else {
		sel = document.querySelector('#label-Jeju-do');
		id_name = '#label-Jeju-do';
	}
	// value 값을 끄집어와서 '#label-Jeju-do' ==> aa
	let del = document.querySelector('#del');
	console.log(del.value);
	if(del.value != "") {
		let del_sel = document.querySelector(del.value);
		let strValue = del_sel.innerHTML;
		del_sel.innerHTML = strValue.split(" ")[0];
	}
	sel.innerHTML = city + " " + value;
	del.value = id_name;
	// value  저장
}


async function testMap() {
	let contextPath = document.querySelector('#contextPathHolder').getAttribute('data-contextPath');
	console.log("하하하");
	console.log(contextPath);
	console.log("호호호");
	const targetUrl = contextPath + "/query/SidoCodeAll";
	let formData = new FormData();
	const options = {
		method: "post",
		body: formData,
	}

	try {
		let response = await fetch(targetUrl, options);
		let result = await response.json();

		console.log(result);
		let sel = document.querySelector('#sidocode');
		console.log(sidocode);
		deleteOptions(sel);
		for (let item of result) {
			let option = document.createElement('option');
			option.value = result.sidoCodeMK.sidocode;
			option.innerText = result.sidoCodeMK.sidoname;
			sel.append(option);
		}



		//select_option('#sido_child option', index);
		sel.dispatchEvent(new Event('change'));
	} catch (err) {
		alert(err);
	}
}



function select_option(selector, index) {
	let options = document.querySelectorAll(selector);
	for (let option of options) {
		if (option.value == index) {
			option.selected = true;
			break;
		}
	}
}

function deleteOptions(dropBox) {
	while (dropBox.options.length > 0) {
		dropBox.remove(0); // 리셋
	}
}