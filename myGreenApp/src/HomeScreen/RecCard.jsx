

function RecCard({name,desc}) {
    return(
        <div className="rec-card">
            <h3>{name}</h3>
            <p>{desc}</p>
        </div>
    );
}

export default RecCard