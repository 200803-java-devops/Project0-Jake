create table Integrals
(   id int,
    Integral VARCHAR,
    Solution VARCHAR
);

insert into Integrals values ('1','a*dx','a*x+C');
insert into Integrals values ('2','x^n','(x^(n+1))/(n+1)+C');
insert into Integrals values ('3','dx/x','ln(x)+C');
insert into Integrals values ('4','e^x*dx','e^x+C');
insert into Integrals values ('5','a^x*dx','(a^x)/ln(a)+C');
insert into Integrals values ('6','sin(x)*dx','-cos(x)+C');
insert into Integrals values ('7','cos(x)*dx','sin(x)+C');
insert into Integrals values ('8','(sec(x))^2*dx','tan(x)+C');
insert into Integrals values ('9','(csc(x))^2*dx','-cot(x)+C');
insert into Integrals values ('10','sec(x)*tan(x)*dx','sec(x)+C');
insert into Integrals values ('11','csc(x)*cot(x)*dx','-csc(x)+C');
insert into Integrals values ('12','tan(x)*dx','ln|sec(x)|+C');
insert into Integrals values ('13','cot(x)*dx','ln|sin(x)|+C');
insert into Integrals values ('14','sec(x)*dx','ln|sec(x)+tan(x)|+C');
insert into Integrals values ('15','csc(x)*dx','ln|csc(x)-cot(x)|+C');
insert into Integrals values ('16','dx/(sqrt(a^2-x^2))','asin(x/a)+C');
insert into Integrals values ('17','dx/(a^2+x^2)','(atan(x/a))/a+C');
insert into Integrals values ('18','dx/(x*sqrt(x^2-a^2))','(asec(x/a))/a+C');
insert into Integrals values ('19','dx/(a^2-x^2)','ln|(x+a)/(x-a)|/(2*a)+C');
insert into Integrals values ('20','dx/(x^2-a^2)','ln|(x-a)/(x+a)|/(2*a)+C');