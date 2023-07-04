import $ from 'jquery';

function checkValue() {
  const sectors = document.getElementById('sectors');
  const name2 = $("#name");

  console.log(name2);
  
  
  let childrenArray = sectors.children;
  let sectorsArray = [];
  
  for (let i = 0; i < childrenArray.length; i++) {
    sectorsArray.push(childrenArray[i]);
  }
  
  sectorsArray.forEach(element => {
    console.log(element.text.trim());
  });

}