package Chat.Server;

public class ServerClientInfo {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final boolean wantsNotifications;

    private ServerClientInfo(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.wantsNotifications = builder.wantsNotifications;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isWantsNotifications() {
        return wantsNotifications;
    }

    @Override
    public String toString() {
        return "Client[" + firstName + " " + lastName + ", " + email +
                ", notifications=" + wantsNotifications + "]";
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private String email;
        private boolean wantsNotifications;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setWantsNotifications(boolean wantsNotifications) {
            this.wantsNotifications = wantsNotifications;
            return this;
        }

        public ServerClientInfo build() {
            if (firstName == null || firstName.trim().isEmpty()) {
                throw new IllegalArgumentException("First name is invalid");
            }
            if (lastName == null || lastName.trim().isEmpty()) {
                throw new IllegalArgumentException("Last name is invalid");
            }
            if (email == null || email.trim().isEmpty() || !email.contains("@")) {
                throw new IllegalArgumentException("Email is invalid");
            }
            return new ServerClientInfo(this);
        }
    }
}

