function typed() {
  const typed = new Typed('#main_typed', {
    stringsElement: '#typed_string',
    typeSpeed: 120,
    backSpeed: 80,
    startDelay: 400,
    loop: true,
    loopCount: Infinity,
  });
}

/** background image changer **/
function background() {
  const background = ['/image/background1.jpg'];

  let rand = Math.floor(Math.random() * background.length);
  document.querySelector('.campus_background').style.backgroundImage = `url(${
    background[rand]
  })`;
}

document.addEventListener('DOMContentLoaded', () => {
  /** typed.js **/
  typed();
  /** background image slide **/
  // background();
});
