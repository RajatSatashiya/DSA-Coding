const culturePic = document.querySelector(".slideshow");
const items = document.querySelector(".nav-items");
const navToggle = document.querySelector(".nav-toggle");
const links = document.querySelector(".links");
const college = document.querySelector(".college");
const hideLogo = document.querySelector(".hide");
const navBar = document.querySelector(".nav-bar");
var i = -1;

const imgArray = [
  "https://ftw.usatoday.com/wp-content/uploads/sites/90/2014/07/afp-531655629_001.jpg?w=1200&h=600&crop=1",
  "https://www.abc.net.au/news/image/5595494-3x2-940x627.jpg",
  "https://cdn.britannica.com/93/20293-050-72F04DDC/Costumes-masks-celebrations-pre-Lenten-Germany-Rottweil.jpg",
  "https://www.studying-in-germany.org/wp-content/uploads/2018/07/German-Culture-and-Traditions.jpg",
  "https://previews.123rf.com/images/foottoo/foottoo1709/foottoo170900589/86016014-munich-alemania-16-de-septiembre-de-2017-el-oktoberfest-es-el-festival-de-cerveza-m%C3%A1s-grande-del-mundo.jpg",
  "https://s3.amazonaws.com/the-drive-staging/message-editor%2F1520362523292-beauty9.jpg",
];

const screenImages = [
  "./mobile-images/football.jpg",
  "./mobile-images/celebration.jpg",
  "./mobile-images/oktober.jpg",
  // "./mobile-images/houses.jpg",
  // "./mobile-images/rally.jpg",
  // "./mobile-images/porsche.jpg",
];

const images = (arr, delay) => {
  i++;
  if (i == arr.length) {
    i = 0;
  }
  culturePic.style.backgroundImage = `url("${arr[i]}")`;
  setTimeout(() => {
    images(arr, delay);
  }, delay);
};

if (screen.width < 600) {
  images(screenImages, 7000);
} else {
  images(imgArray, 5000);
}

navToggle.addEventListener("click", () => {
  items.classList.toggle("show-items");
  const containerHeight = items.getBoundingClientRect().height;
  const linkHeight = links.getBoundingClientRect().height;

  if (containerHeight === 0) {
    items.style.height = `${linkHeight}px`;
  } else {
    items.style.height = 0;
  }
});

window.addEventListener("scroll", () => {
  if (window.scrollY >= college.offsetTop) {
    hideLogo.style.visibility = "visible";
  } else if (window.scrollY < college.offsetTop) {
    hideLogo.style.visibility = "hidden";
  }
});

const scrollLink = document.querySelectorAll(".scroll-link");

scrollLink.forEach(function (link) {
  link.addEventListener("click", (e) => {
    e.preventDefault();

    const id = e.currentTarget.getAttribute("href").slice(1);
    const element = document.getElementById(id);
    let position = element.offsetTop;
    window.scrollTo({
      left: 0,
      top: position - navBar.getBoundingClientRect().height,
    });

    items.style.height = 0;
  });
});
