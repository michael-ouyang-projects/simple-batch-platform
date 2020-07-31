package tw.ouyang.simplebatchplatform.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tw.ouyang.simplebatchplatform.model.Batch;

public class BatchRowMapper implements RowMapper<Batch> {

    @Override
    public Batch mapRow(ResultSet rs, int rowNum) throws SQLException {
        Batch batch = new Batch();
        batch.setId(rs.getString("ID"));
        batch.setJarName(rs.getString("JAR_NAME"));
        batch.setNote(rs.getString("NOTE"));
        batch.setHour(Integer.parseInt(rs.getString("HOUR")));
        batch.setMinute(Integer.parseInt(rs.getString("MINUTE")));
        batch.setWaitingBatchId(rs.getString("WAITING_BATCH_ID"));
        return batch;
    }

}
