import { Link } from "react-router-dom";
import NavBar from "./HomeNav";
import MapSection from "./MapSection";

function HomeScreen(){
    return(
        <div>
            <NavBar/>
            <MapSection/>
        </div>
    );
}

export default HomeScreen