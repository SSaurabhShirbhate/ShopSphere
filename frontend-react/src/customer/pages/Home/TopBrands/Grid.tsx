import React from "react";
import { useAppSelector } from "../../../../Redux Toolkit/Store";

const grid = [
  {"categoryId":"women_lehenga_cholis",
        "section": "GRID",
        "name": "women lehenga cholis",
    image:
      "https://i.pinimg.com/736x/38/5c/c3/385cc3655eac62ff2f7dcc107d05a688.jpg",
  },
  {"categoryId":"men_formal_shoes",
        "section": "GRID",
        "name": "men formal shoes",
    image:
      "https://i.pinimg.com/736x/ec/4a/1c/ec4a1cd8c589374ad425a9c8e21256f9.jpg  ",
  },
  {"categoryId":"women_lehenga_cholis",
        "section": "GRID",
        "name": "women lehenga cholis",
    image:
      "https://images.pexels.com/photos/12730873/pexels-photo-12730873.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
  },
  {"categoryId":"men_sherwanis",
        "section": "GRID",
        "name": "men sherwanis",
    image:
      "https://images.pexels.com/photos/4887246/pexels-photo-4887246.jpeg?auto=compress&cs=tinysrgb&w=600",
  },
  {"categoryId":"women_jewellery",
        "section": "GRID",
        "name": "women jewellery",
    image:
      "https://images.pexels.com/photos/2397351/pexels-photo-2397351.jpeg?auto=compress&cs=tinysrgb&w=600",
  },
  {"categoryId":"women_footwear",
        "section": "GRID",
        "name": "women footwear",
    image:
      "https://images.pexels.com/photos/4352247/pexels-photo-4352247.jpeg?auto=compress&cs=tinysrgb&w=600",
  },
];
const TopBrand = () => {
  const {homePage}=useAppSelector(store=>store)
  return (
    <div className="grid gap-4 grid-rows-12 grid-cols-12 lg:h-[600px] px-5 lg:px-20">
      <div className=" col-span-3 row-span-12  text-white  rounded ">
        <img
          className="w-full h-full object-cover border-fuchsia-800 lg:border-[9px]s rounded-md"
          src={homePage.homePageData?.grid[0].image}
          alt=""
        />
      </div>

      <div className="col-span-2 row-span-6  text-white rounded">
        <img
          className="w-full h-full object-cover border-fuchsia-800 lg:border-[9px]s rounded-md"
          src={homePage.homePageData?.grid[1].image}
          alt=""
        />
      </div>

      <div className="col-span-4 row-span-6  text-white  rounded ">
        <img
          className="w-full h-full object-cover object-top border-fuchsia-800 lg:border-[9px]s rounded-md"
          src={homePage.homePageData?.grid[2].image}
          alt=""
        />
      </div>

      <div className="col-span-3 row-span-12  text-white  rounded ">
        <img
          className="w-full h-full object-cover object-top border-fuchsia-800 lg:border-[9px]s rounded-md"
          src={homePage.homePageData?.grid[3].image}
          alt=""
        />
      </div>

      <div className="col-span-4 row-span-6  text-white  rounded ">
        <img
          className="w-full h-full object-cover object-top border-fuchsia-800 lg:border-[9px]s rounded-md"
          src={homePage.homePageData?.grid[4].image}
          alt=""
        />
      </div>
      <div className="col-span-2 row-span-6  text-white rounded ">
        <img
          className="w-full h-full object-cover border-fuchsia-800 lg:border-[9px]s rounded-md"
          src={homePage.homePageData?.grid[5].image}
          alt=""
        />
      </div>

      {/* https://tristenwallace.com/wp-content/uploads/2022/06/wed-7.jpg */}
    </div>
  );
};

export default TopBrand;
