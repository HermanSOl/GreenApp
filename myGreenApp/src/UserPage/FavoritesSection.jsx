import Recommendations from "../HomeScreen/Recommendations";


function FavoritesSection(){
    return(
        <div className="favorites-container">
            <Recommendations stores={[{name: "EcoStore", desc: "Some default store"}]}/>
        </div>
    );
}

export default FavoritesSection;