const culturePic = document.querySelector(".slideshow");
var i = -1;

const imgArray = [
  "https://ftw.usatoday.com/wp-content/uploads/sites/90/2014/07/afp-531655629_001.jpg?w=1200&h=600&crop=1",
  "https://www.abc.net.au/news/image/5595494-3x2-940x627.jpg",
  "https://cdn.britannica.com/93/20293-050-72F04DDC/Costumes-masks-celebrations-pre-Lenten-Germany-Rottweil.jpg",
  "https://www.studying-in-germany.org/wp-content/uploads/2018/07/German-Culture-and-Traditions.jpg",
  "https://previews.123rf.com/images/foottoo/foottoo1709/foottoo170900589/86016014-munich-alemania-16-de-septiembre-de-2017-el-oktoberfest-es-el-festival-de-cerveza-m%C3%A1s-grande-del-mundo.jpg",
  "https://s3.amazonaws.com/the-drive-staging/message-editor%2F1520362523292-beauty9.jpg",
];

const images = () => {
  i++;
  if (i == imgArray.length) {
    i = 0;
  }
  culturePic.style.backgroundImage = `url("${imgArray[i]}")`;
  setTimeout(() => {
    images();
  }, 5000);
};
images();
