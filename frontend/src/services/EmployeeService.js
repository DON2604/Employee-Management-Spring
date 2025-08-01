import axios from 'axios';

const API_URL = 'https://employee-management-spring-production.up.railway.app';

class EmployeeService {
  getAllEmployees() {
    return axios.get(`${API_URL}/employees`);
  }

  getEmployeeById(id) {
    return axios.get(`${API_URL}/employees/${id}`);
  }

  createEmployee(employee) {
    return axios.post(`${API_URL}/employees`, employee);
  }

  updateEmployee(id, employee) {
    return axios.put(`${API_URL}/employees/${id}`, employee);
  }

  deleteEmployee(id) {
    return axios.delete(`${API_URL}/employees/${id}`);
  }
}

export default new EmployeeService();
