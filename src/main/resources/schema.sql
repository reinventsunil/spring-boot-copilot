--public long userId;
--    public String userName;
--    public String userPassword;
--    public String userEmail;
--    public String userPhone;
--    public String userAddress;
--    public String userDOB;
--    public String userGender;
--    public String userRole;
drop table if exists users;
create table users(
    user_id serial primary key,
    user_name varchar(50) not null,
    user_password varchar(50) not null,
    user_email varchar(50) not null,
    user_phone varchar(50) not null,
    user_address varchar(50) not null,
    user_dob varchar(50) not null,
    user_gender varchar(50) not null,
    user_role varchar(50) not null
);