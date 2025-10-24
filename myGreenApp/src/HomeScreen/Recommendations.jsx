import RecCard from "./RecCard";


function Recommendations(){
    return(
        <div className="recommendations">
            <h2>Recomended Stores:</h2>
            <div className="rec-list">
                <RecCard name={"EcoStore"} desc={"Some cool description"}/>
            </div>
        </div>
    );
}

export default Recommendations