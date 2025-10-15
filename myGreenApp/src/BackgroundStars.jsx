

function BackgroundStars({count,color}){
    const shadows = [];
    for (let i = 0; i < count; i++) {
        const x = Math.floor(Math.random() * 2000);
        const y = Math.floor(Math.random() * 2000);
        shadows.push(`${x}px ${y}px ${color}`);
        shadows.push(`${x + 0.7}px ${y + 1}px gray`);
    }
    shadows.join(',')
    return(
        <div class = "backround-star-container">
        <div class = "background-star1"
        style = {{boxShadow: shadows}}></div>
        <div class = "background-star2">
        </div>
        </div>
       
    );
}

export default BackgroundStars