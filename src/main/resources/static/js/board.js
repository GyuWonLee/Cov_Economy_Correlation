function fn_enable() {
	document.querySelector("#i_title").disabled = false;
	document.querySelector("#i_content").disabled = false;
	document.querySelector("#tr_btn_modify").style.display = "table-row";
	document.querySelector("#tr_btn").style.display = "none";
}