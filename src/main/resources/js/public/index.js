
const form = $('#form');
const checkNameButton = $('#checkNameButton', form);



checkNameButton.on('click', () => {
  let nameValue = $('#name').val();
  if (nameValue) {
    console.log("Nimi: " + nameValue);
  } else if (!nameValue) {
    console.log("Nimi puudu");
  } else {
    console.log("Miski on vittus");
  };
})