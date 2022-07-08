
insert into customer_type(name_customer_type)values
("Diamond"),
("Platinium"),
("Gold"),
("Silver"),
("Member");
insert into education_degree(name_education)values
("Trung cấp"),
("Cao đẳng"),
("Đại học"),
("Sau đại học");
insert into division(name_division)values
("Sale – Marketing"),
("Hành Chính"),
("Phục vụ"),
("Quản lý");
insert into position (name_position)values
("Lễ tân "),
("Phục Vụ"),
("Chuyên viên"),
("Quản lý"),
("Giám Đốc"),
("Giám xác");
insert into facility_type (name_facility_type)values
("Vilaa"),
("House"),
("Room");
insert into rent_type (name_rent_type)values
("ngày"),
("Tháng"),
("Năm");
insert into attach_facility (cost_attach_facility,name_attach_facility,status_attach_facility,uint_attach_facility)values
(10000,"karaoke","phòng vip","1 giờ"),
(15000,"massa","phòng vip","1 giờ"),
(5000,"Đồ ăn","buffer","1 người"),
(2000,"NƯớc uống ","Đủ loại","1 chai");

select contract_id_contract , attach_facility_id_attach_facility, sum(quantity) from contract_detail 
where contract_id_contract =2
group by  attach_facility_id_attach_facility;
