const tourList = [
    {
        title: "Instagram Incense Quang Phu Cau Village Tour & Train Street",
        image: "Tour-SamSon.png",
        price: 944000,
        rating: 4.8,
        reviews: 143,
        link: "TEST.html"
      },
      {
        title: "Tour Khám Phá Hà Nội và Đồng Bằng Sông Hồng",
        image: "Tour-SamSon.png",
        price: 1080723,
        rating: 4.9,
        reviews: 78,
        link: "TEST.html"
      },
      {
        title: "Tour Đi Bộ Ẩm Thực Đường Phố Hà Nội",
        image: "Tour-SamSon.png",
        price: 584063,
        rating: 4.7,
        reviews: 132,
        link: "TEST.html"
      },
      {
        title: "Tour Đi Bộ Ẩm Thực Đường Phố Hà Nội",
        image: "Tour-SamSon.png",
        price: 584063,
        rating: 4.7,
        reviews: 132,
        link: "TEST.html"
      },
      {
        title: "Tour Đi Bộ Ẩm Thực Đường Phố Hà Nội",
        image: "Tour-SamSon.png",
        price: 584063,
        rating: 4.7,
        reviews: 132,
        link: "TEST.html"
      },
      {
        title: "Tour Đi Bộ Ẩm Thực Đường Phố Hà Nội",
        image: "Tour-SamSon.png",
        price: 584063,
        rating: 4.7,
        reviews: 132,
        link: "TEST.html"
      },
      {
        title: "Tour Đi Bộ Ẩm Thực Đường Phố Hà Nội",
        image: "Tour-SamSon.png",
        price: 584063,
        rating: 4.7,
        reviews: 132,
        link: "TEST.html"
      },
      {
        title: "Tour Đi Bộ Ẩm Thực Đường Phố Hà Nội",
        image: "Tour-SamSon.png",
        price: 584063,
        rating: 4.7,
        reviews: 132,
        link: "TEST.html"
      }

  ];
  
  const ul = document.querySelector('ul');
  tourList.forEach(tour => {
    const li = document.createElement('li');
    li.innerHTML = `
    <a href="${tour.link}" style="text-decoration: none; color: inherit;">
      <img src="${tour.image}" alt="${tour.title}">
      <div class="tour-title">${tour.title}</div>
      <div>⭐ ${tour.rating} (${tour.reviews} đánh giá)</div>
      <div class="tour-price">${tour.price.toLocaleString()} ₫</div>
    </a>
  `;
    ul.appendChild(li);
  });
  