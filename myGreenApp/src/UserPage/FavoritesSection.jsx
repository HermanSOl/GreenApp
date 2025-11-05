import RecCard from "../HomeScreen/RecCard";
import Recommendations from "../HomeScreen/Recommendations";


function FavoritesSection(){
    return(
        <div className="favorites-container">
            <RecCard name={"Someone"} desc={"something"}></RecCard>
            <RecCard name={"Someone2"} desc={"something2"}></RecCard>
        </div>
    );
}

export default FavoritesSection;