var cualField = document.getElementById("si-field");
  var cualRadio = document.getElementsByName("newsletter")[0]; // el segundo, índice 1, es el "no" radio
  var noRadio = document.getElementsByName("newsletter")[1]; 

  cualRadio.addEventListener("change", function() {
    if (cualRadio.checked) {
      cualField.style.display = "block";
    } else {
      cualField.style.display = "none";
    }
  });
  noRadio.addEventListener("change", function() {
    cualField.style.display = "none";
  });




  var cual2Field = document.getElementById("si2-field");
  var cual2Radio = document.getElementsByName("vacuna")[0]; // el segundo, índice 1, es el "no" radio
  var cual22Radio = document.getElementsByName("vacuna")[1]; 
  var cual222Radio = document.getElementsByName("vacuna")[2]; 
  var no2Radio = document.getElementsByName("vacuna")[3]; 
  cual2Radio.addEventListener("change", function() {
    if (cual2Radio.checked) {
      cual2Field.style.display = "block";
    }else{
       cual2Field.style.display = "none";
    }

  });
  cual22Radio.addEventListener("change", function() {
    if (cual22Radio.checked) {
      cual2Field.style.display = "block";
    }else{
       cual2Field.style.display = "none";
    }

  });
  cual222Radio.addEventListener("change", function() {
    if (cual222Radio.checked) {
      cual2Field.style.display = "block";
    }else{
       cual2Field.style.display = "none";
    }

  });
  no2Radio.addEventListener("change", function() {
    cual2Field.style.display = "none";
  });




  var cual1Field = document.getElementById("si1-field");
  var cual1Radio = document.getElementsByName("opcion")[0]; // el segundo, índice 1, es el "no" radio
  var no1Radio = document.getElementsByName("opcion")[1]; 

  cual1Radio.addEventListener("change", function() {
    if (cual1Radio.checked) {
      cual1Field.style.display = "block";
    } else {
      cual1Field.style.display = "none";
    }
  });
  no1Radio.addEventListener("change", function() {
    cual1Field.style.display = "none";
  });