package _21_NestedClass;

// 빌터 패턴을 적용시켜 주세요
public class Client {
    private String name;
    private String ip;
    private String deviceName;

    private Client(Builder builder) {
        this.name = builder.name;
        this.ip = builder.ip;
        this.deviceName = builder.deviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    private static class Builder {
        private String name;
        private String ip;
        private String deviceName;

        public Client builder() {
            // 여기서의 this는 builder객체 자기자신
            Client c = new Client(this);
            return c;
        }

        public Builder name(String name) {
            this.name = name;
            return this; // 자기자신을 리턴하기 때문에 체이닝 가능
        }

        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
    }
}
