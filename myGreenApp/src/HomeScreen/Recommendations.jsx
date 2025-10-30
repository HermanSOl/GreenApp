import RecCard from "./RecCard";


function Recommendations({stores}){
    return(
        <div className="recommendations">
            <h2>Recomended Stores:</h2>
            <div className="rec-list">
            {stores.map((store, index) => (
          <RecCard 
            key={index} 
            name={store.name} 
            desc={store.desc} 
          />
            ))}
            </div>
        </div>
    );
}

export default Recommendations