show databases;
drop database account;
drop database books;
drop database customer_order;
CREATE DATABASE insurance_db;
use insurance_db;
create table insurancePolicy(policyNumber int not null auto_increment, holderName varchar(20) not null,
                             startDate date not null, endDate date not null, coverageAmount int not null,
                             includeExtremeSports boolean default false, includeBaggage boolean default false,
                             includeFlightDelay boolean default false, deductibal int default 0, promoCode varchar(20),
                             primary key(policyNumber));
desc insurancePolicy;

insert into insurancePolicy (holderName, startDate, endDate, coverageAmount, includeExtremeSports, includeBaggage, includeFlightDelay, deductibal, promoCode) values (
                                                                                                                                                                         'Alex', '2026-10-1', '2026-10-11', 50000, 1,0,0,50,'travel10');
insert into insurancePolicy (holderName, startDate, endDate, coverageAmount, includeExtremeSports, includeBaggage, includeFlightDelay, deductibal, promoCode) values
    ('Marta', '2025-9-9', '2025-9-20', 100000,0,1,1,50, null);
insert into insurancePolicy (holderName, startDate, endDate, coverageAmount, includeExtremeSports, includeBaggage, includeFlightDelay, deductibal, promoCode) values(
                                                                                                                                                                        'Tom', '2026-1-1', '2026-1-10', 10000, 0,0,1,100,null);
select * from insurancePolicy