import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import './HomePage.css';
import AppNavbar from '../components/Navbar';
import HomeContent from '../components/HomeContent';

const HomePage = () => {
    return (
        <div className="homepage">
            <AppNavbar />
            <div className="homepage-header">
                <h1>Shape Your Body From Now</h1>
                <p>Achieve your training goals with the right plan and professional instructor</p>
                <button className="get-started-btn">Getting Started</button>
            </div>
            <HomeContent />
        </div>
    );
};

export default HomePage;
