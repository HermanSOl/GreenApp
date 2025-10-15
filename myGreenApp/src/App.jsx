import LoginCard from "./LoginCard"
import BackgroundStars from "./BackgroundStars"

function App() {
    return(
        <body>
            <BackgroundStars count={200} color={"#62C370"}/>
            <LoginCard title={"Login"}/>
        </body>
        
    )
}

export default App
