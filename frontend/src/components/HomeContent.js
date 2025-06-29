import React from 'react';
import { Container, Row, Col, Card, Form, Button } from 'react-bootstrap';

const HomeContent = () => {
    return (
        <Container className="mt-5">
            {/* Programs */}
            <section className="programs-section">
                <h2 className="text-center">Our Programs</h2>
                <Row className="mt-3">
                    <Col md={3}>
                        <Card className="program-card">
                            <Card.Body>
                                <Card.Title>Simple Workout</Card.Title>
                                <Card.Text>Customized plans with support.</Card.Text>
                            </Card.Body>
                        </Card>
                    </Col>
                    <Col md={3}>
                        <Card className="program-card">
                            <Card.Body>
                                <Card.Title>Progress Tracking</Card.Title>
                                <Card.Text>Track your progress easily.</Card.Text>
                            </Card.Body>
                        </Card>
                    </Col>
                    <Col md={3}>
                        <Card className="program-card">
                            <Card.Body>
                                <Card.Title>Nutrition Monitoring</Card.Title>
                                <Card.Text>Keep your nutrition in check.</Card.Text>
                            </Card.Body>
                        </Card>
                    </Col>
                    <Col md={3}>
                        <Card className="program-card">
                            <Card.Body>
                                <Card.Title>Recommended Programs</Card.Title>
                                <Card.Text>Explore pre-made fitness plans.</Card.Text>
                            </Card.Body>
                        </Card>
                    </Col>
                </Row>
            </section>

            {/* Testimonials */}
            <section className="testimonials-section">
                <h2 className="text-center">Testimonials</h2>
                <Row className="mt-3">
                    <Col md={4}>
                        <div className="testimonial p-3">
                            <p>“ FitPilot helps me stay on track with my personal workouts! ”</p>
                            <strong>Alex Doe</strong>
                            <div>New York, USA</div>
                        </div>
                    </Col>
                    <Col md={4}>
                        <div className="testimonial p-3">
                            <p>“ Love the nutrition tips and easy tracking tools. ”</p>
                            <strong>Sam Lee</strong>
                            <div>Toronto, Canada</div>
                        </div>
                    </Col>
                    <Col md={4}>
                        <div className="testimonial p-3">
                            <p>“ The recommended programs gave me a great head start! ”</p>
                            <strong>Maya Kim</strong>
                            <div>Seoul, Korea</div>
                        </div>
                    </Col>
                </Row>
            </section>

            {/* Email Signup */}
            <section className="email-signup mt-5">
                <Row className="align-items-center">
                    <Col md={6}>
                        <h2>Get Your Free Guide Now!!</h2>
                        <p>You'll get training and nutrition tips to create positive lifestyle habits.</p>
                        <Form className="d-flex">
                            <Form.Control type="email" placeholder="Your Email*" className="me-2" />
                            <Button type="submit">Send</Button>
                        </Form>
                    </Col>
                </Row>
            </section>
        </Container>
    );
};

export default HomeContent;