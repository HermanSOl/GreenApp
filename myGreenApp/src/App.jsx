import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import StartingPage from "./StartingPage"
import LoginCard from "./LoginCard";

import CreateAccountPage from "./CreateAccountPage";


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
