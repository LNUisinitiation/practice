select `d`.`deptId` AS `deptId`,`d`.`deptName` AS `deptName`,(select count(0) AS `count(*)` from `emp` where (`emp`.`deptId` = `d`.`deptId`)) AS `empNum` 
from `dept` `d`
select `e`.`empId` AS `empId`,`e`.`empName` AS `empName`,`e`.`salary` AS `salary`,`e`.`inDate` AS `inDate`,`d`.`deptId` AS `deptId`,`d`.`deptName` AS `deptName` 
from (`emp` `e` join `dept` `d`) 
where (`e`.`deptId` = `d`.`deptId`)
