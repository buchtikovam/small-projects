import ApiService, { getToken } from "./ApiService";

class VehicleApiService {
  apiService = new ApiService();

  getAvailable() {
    return this.apiService.get("/vehicles", {
      Authorization: `Bearer ${getToken()}`,
      "Content-Type": "application/json",
    });
  }
}

export default new VehicleApiService();
