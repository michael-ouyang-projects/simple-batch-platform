INSERT INTO DAILY_BATCH(JAR_NAME, NOTE, HOUR, MINUTE, WAITING_JAR) VALUES('billsetuptask', 'create table BILL_STATEMENTS', '14', '00', null);
INSERT INTO DAILY_BATCH(JAR_NAME, NOTE, HOUR, MINUTE, WAITING_JAR) VALUES('billrun', 'insert data to table BILL_STATEMENTS', '14', '00', 'billsetuptask');