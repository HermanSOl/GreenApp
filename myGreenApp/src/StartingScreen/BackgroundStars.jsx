

function BackgroundStars({count,color}){
    const shadows = [];
    for (let i = 0; i < count; i++) {
        const x = Math.floor(Math.random() * 2000);
        const y = Math.floor(Math.random() * 2000);
        shadows.push(`${x}px ${y}px ${color}`);
    }
    shadows.join(',')
    return(
        <div class = "background-star" id = {"back-star" + count}
        style = {{boxShadow: shadows}}></div>
       
    );
}

export default BackgroundStars