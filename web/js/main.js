
/*
-------------------- INICIAN CONTROLADORES PRINCIPALES --------------------
*/

//Funcion para poder mostrar/esconder contenedores html utilizando el id
function show_container(id_container){
	//Mandamos a llamar la funcion del document para obtener contenedor id
	let container = document.getElementById(id_container);
	container.style.display = "flex"; //Cambiamos el atributo de estilo display del objeto
}

function hide_container(id_container){
	//Mandamos a llamar la funcion del document para obtener contenedor id
	let container = document.getElementById(id_container);
	container.style.display = "none"; //Cambiamos el atributo de estilo display del objeto
}

//Funcion que permite hacer el pop up  de los modales
function togglePopup(){
    document.getElementById("popup-1").classList.toggle("active");

}

document.addEventListener('keydown', function(event){
	if(event.key === "Escape"){
document.getElementById("popup-1").classList.toggle("active");
	}
})


function togglePopup2(){
    document.getElementById("popup-2").classList.toggle("active");

}


/*
-------------------- INICIAN CONTROLADORES DEL LOGIN --------------------
*/



function comeDom (){
    let usuarios = new Object();
    let user=document.getElementById("user");
    let pass=document.getElementById("pass");
    let tipUsr=document.getElementById("tipUsr");
    usuarios.user=user.value;
    usuarios.pass=pass.value;
    usuarios.tipUsr=tipUsr.value;
}

function sendData(){
	const XHR = new XMLHttpRequest();
	  var formData = new URLSearchParams(new FormData(document.getElementById('form'))).toString();
	  XHR.addEventListener('error',(event) => {alert('Oops! ah ocurrido un error (T_T)');});
	  XHR.open('POST', 'ServletUser', true);
          XHR.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                    
          XHR.onload = () => { if (XHR.readyState === XHR.DONE && XHR.status === 200){
            console.log("response => " + XHR.response);
            susMsj('Registro Exitoso'); }};
          XHR.send(formData);	
}

function sendDataPro(){
	const XHR = new XMLHttpRequest();
	  var formData = new URLSearchParams(new FormData(document.getElementById('formpro'))).toString();
	  XHR.addEventListener('error',(event) => {alert('Oops! ah ocurrido un error (T_T)');});
	  XHR.open('POST', 'ServletProject', true);
          XHR.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                    
          XHR.onload = () => { if (XHR.readyState === XHR.DONE && XHR.status === 200){
            console.log("response => " + XHR.response);
            susMsj('Registro Exitoso'); }};
          XHR.send(formData);	
}
function susMsj(msj){
  Swal.fire({
  icon: 'success',
  title: msj,
  showConfirmButton: false,
  timer: 1500
})
}

/*
-------------------- Para el modo oscuro--------------------
*/


const btnSwitch = document.querySelector('#switch');
btnSwitch.addEventListener('click', () =>
{
  document.body.classList.toggle('dark');
  btnSwitch.classList.toggle('active');

if(document.body.classList.contains('dark')){
  localStorage.setItem('dark-mode', 'true');
} else {
  localStorage.setItem('dark-mode', 'false');
}

});

if(localStorage.getItem('dark-mode')== 'true'){
  document.body.classList.toggle('dark'); 
  btnSwitch.classList.add('active');
} else{
  document.body.classList.remove('dark'); 
  btnSwitch.classList.remove('active');
}


/*-----------------Para el menu desplegable-----------------*/

let sidebar = document.querySelector(".sidebar");
let closeBtn = document.querySelector("#btn");
let searchBtn = document.querySelector(".bx-search");

closeBtn.addEventListener("click", ()=>{
  sidebar.classList.toggle("open");
  menuBtnChange();//calling the function(optional)
});

searchBtn.addEventListener("click", ()=>{ // Sidebar open when you click on the search iocn
  sidebar.classList.toggle("open");
  menuBtnChange(); //calling the function(optional)
});

// following are the code to change sidebar button(optional)
function menuBtnChange() {
 if(sidebar.classList.contains("open")){
   closeBtn.classList.replace("bx-menu", "bx-menu-alt-right");//replacing the iocns class
 }else {
   closeBtn.classList.replace("bx-menu-alt-right","bx-menu");//replacing the iocns class
 }
}