import { Link } from "react-router-dom";
import HomeNavBar from "./HomeNavBar";
import MapSection from "./MapSection";
import Recommendations from "./Recommendations";

function HomeScreen(){
    return(
        <div>
            <HomeNavBar/>
            <MapSection/>
            <Recommendations stores={[{name: "EcoStore", desc: "Some default store"}]}/>
        </div>
    );
}

export default HomeScreen