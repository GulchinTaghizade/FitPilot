import React from 'react';
import { Navbar, Nav, Container, Button } from 'react-bootstrap';

const AppNavbar = () => {
    return (
        <Navbar bg="light" expand="lg" className="shadow-sm">
            <Container>
                <Navbar.Brand href="#">FitPilot</Navbar.Brand>
                <Navbar.Toggle aria-controls="fitpilot-navbar" />
                <Navbar.Collapse id="fitpilot-navbar">
                    <Nav className="ms-auto">
                        <Nav.Link href="#">Home</Nav.Link>
                        <Nav.Link href="#">My Workouts</Nav.Link>
                        <Nav.Link href="#">Fitness Goals</Nav.Link>
                        <Nav.Link href="#">Exercises</Nav.Link>
                        <Nav.Link href="#">Recommended</Nav.Link>
                        <Button variant="danger" className="ms-3">Register</Button>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );
};

export default AppNavbar;