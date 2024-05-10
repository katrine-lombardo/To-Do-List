import axios from "axios";

const API_URL = "/todo-items";

class ToDoService {
  getAll() {
    return axios.get(API_URL);
  }

  create(todoItem) {
    return axios.post(API_URL, todoItem);
  }

  update(id, todoItem) {
    return axios.put(`${API_URL}/${id}`, todoItem);
  }

  delete(id) {
    return axios.delete(`${API_URL}/${id}`);
  }
}

export default new ToDoService();
