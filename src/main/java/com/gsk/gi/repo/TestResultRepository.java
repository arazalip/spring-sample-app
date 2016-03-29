package com.gsk.gi.repo;

import com.gsk.gi.model.TestResult;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.data.hadoop.hbase.RowMapper;
import org.springframework.data.hadoop.hbase.TableCallback;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.UUID;

@RestController
public class TestResultRepository implements PagingAndSortingRepository<TestResult, String> {

    @Autowired
    private HbaseTemplate hbaseTemplate;

    private static final String TABLE = "test-results";
    private static byte[] CF_INFO = Bytes.toBytes("cf");

    @PostConstruct
    public void init() throws IOException {
        HBaseAdmin hba = new HBaseAdmin(hbaseTemplate.getConfiguration());
        if (!hba.tableExists(TABLE)) {
            HTableDescriptor tableDescriptor = new HTableDescriptor(TABLE);
            HColumnDescriptor columnDescriptor = new HColumnDescriptor(CF_INFO);
            tableDescriptor.addFamily(columnDescriptor);
            hba.createTable(tableDescriptor);
        }
    }


    @RequestMapping(path = "/test-result/save", method = RequestMethod.POST)
    public TestResult save(@RequestBody final TestResult c) {

        return hbaseTemplate.execute(TABLE, new TableCallback<TestResult>() {

            public TestResult doInTable(HTableInterface table) throws Throwable {

                if (c.getId() == null) {
                    c.setId(UUID.randomUUID().toString());
                }
                Put p = new Put(Bytes.toBytes(c.getId()));
                p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "id".getBytes(), Bytes.toBytes(c.getId())));
                if (c.getTitle() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "title".getBytes(), Bytes.toBytes(c.getTitle())));
                if (c.getBatteryId() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "battery_id".getBytes(), Bytes.toBytes(c.getBatteryId())));
                if (c.getClipId() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "clip_id".getBytes(), Bytes.toBytes(c.getClipId())));
                if (c.getScreenId() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "screen_id".getBytes(), Bytes.toBytes(c.getScreenId())));
                if (c.getTestId() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "test_id".getBytes(), Bytes.toBytes(c.getTestId())));
                if (c.getTestPart() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "test_part".getBytes(), Bytes.toBytes(c.getTestPart())));
                if (c.getTestType() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "test_type".getBytes(), Bytes.toBytes(c.getTestType())));
                if (c.getPlayerId() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "player_id".getBytes(), Bytes.toBytes(c.getPlayerId())));
                if (c.getResponseTime() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "response_time".getBytes(), Bytes.toBytes(c.getResponseTime())));
                if (c.getPlayerAge() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "player_age".getBytes(), Bytes.toBytes(c.getPlayerAge())));
                if (c.getPlayerFirstName() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "player_first_name".getBytes(), Bytes.toBytes(c.getPlayerFirstName())));
                if (c.getPlayerLastName() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "player_last_name".getBytes(), Bytes.toBytes(c.getPlayerLastName())));
                if (c.getPlayerHeight() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "player_height".getBytes(), Bytes.toBytes(c.getPlayerHeight())));
                if (c.getPlayerWeight() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "player_weight".getBytes(), Bytes.toBytes(c.getPlayerWeight())));
                if (c.getIp() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "ip".getBytes(), Bytes.toBytes(c.getIp())));
                if (c.getLocation() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "location".getBytes(), Bytes.toBytes(c.getLocation())));
                if (c.getPlayerSex() != null)
                    p.add(new KeyValue(c.getId().getBytes(), CF_INFO, "player_sex".getBytes(), Bytes.toBytes(c.getPlayerSex())));
                table.put(p);
                return c;
            }
        });

    }


    public <S extends TestResult> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @RequestMapping(path = "/test-result/{id}", method = RequestMethod.GET)
    public TestResult findOne(@PathVariable final String id) {
        return hbaseTemplate.execute(TABLE, new TableCallback<TestResult>() {
            public TestResult doInTable(HTableInterface table) throws Throwable {
                Get get = new Get(id.getBytes());
                Result r = table.get(get);
                return null;
            }
        });
    }

    public boolean exists(String s) {
        return false;
    }

    public Iterable<TestResult> findAll() {
        return null;
    }

    public Iterable<TestResult> findAll(Iterable<String> iterable) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void delete(String s) {
    }

    public void delete(TestResult testResult) {

    }

    public void delete(Iterable<? extends TestResult> iterable) {

    }

    public void deleteAll() {

    }


    public Iterable<TestResult> findAll(Sort sort) {
        return null;
    }

    public Page<TestResult> findAll(Pageable pageable) {
        return null;
    }
}
