package Chat.Server;

public class ServerClientInfo {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final boolean wantsNotifications;
    private final ClientRole role;

    private ServerClientInfo(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.wantsNotifications = builder.wantsNotifications;
        this.role = builder.role;
    }
    public ClientRole getRole() {
        return role;
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
        private ClientRole role;

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
        public Builder setRole(ClientRole role) {
            this.role = role;
            return this;
        }
        public ServerClientInfo build() {
            if (firstName == null || firstName.trim().isEmpty())
                throw new IllegalArgumentException("Invalid first name");
            if (lastName == null || lastName.trim().isEmpty())
                throw new IllegalArgumentException("Invalid last name");
            if (email == null || !email.contains("@"))
                throw new IllegalArgumentException("Invalid email");
            if (role == null)
                throw new IllegalArgumentException("Client role is missing");

            return new ServerClientInfo(this);
        }
    }
}

