package device.ojtproject.dto;

import device.ojtproject.domain.ActiveStatus;
import device.ojtproject.domain.DeleteStatus;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EditDevice {
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public static class Request{
        @NotNull
        @Min(1) @Max(999999)
        private Long serialNumber;
        @NotNull
        @Size(min = 3, max=10, message="길이는 3~10자리 사이만 가능합니다.")
        private String macAddress;
        @NotNull
        @Size(min = 3, max=10, message="길이는 3~10자리 사이만 가능합니다.")
        private String qrcode;
        private ActiveStatus activeStatus;
        private DeleteStatus deleteStatus;

    }
}