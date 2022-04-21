package dto;

import lombok.Data;

@Data
public class IpDto {
    private String ip;

    public String getIp() {
        return ip;
    }
}