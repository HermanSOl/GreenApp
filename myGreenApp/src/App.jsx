import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import StartingPage from "./StartingScreen/StartingPage"
import LoginCard from "./StartingScreen/LoginCard";

import CreateAccountPage from "./StartingScreen/CreateAccountPage";


function App() {
    return(
        <Router>
            <Routes>
                <Route path="/" element={<StartingPage/>}/>
                <Route path="/login-account" element={<LoginCard title={"Login"}/>}/>
                <Route path="/create-account" element={<CreateAccountPage/>}/>
            </Routes>
        </Router>
        
        
    )
}

export default App
