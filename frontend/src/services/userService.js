import axios from 'axios';

const API_URL = 'http://localhost:8080/api/users';

export const getAllUsers = () => axios.get(API_URL);
export const createUser = (userData) => axios.post(API_URL, userData);
export const deleteUser = (id) => axios.delete(`${API_URL}/${id}`);