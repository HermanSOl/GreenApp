import { Link } from "react-router-dom";
import NavBar from "./HomeNav";
import MapSection from "./MapSection";
import Recommendations from "./Recommendations";

function HomeScreen(){
    return(
        <div>
            <NavBar/>
            <MapSection/>
            <Recommendations/>
        </div>
    );
}

export default HomeScreen