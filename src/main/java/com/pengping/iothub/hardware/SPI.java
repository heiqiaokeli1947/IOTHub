package com.pengping.iothub.hardware;

import com.pi4j.io.spi.SpiChannel;
import com.pi4j.io.spi.SpiDevice;
import com.pi4j.io.spi.SpiFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;


@Component
public class SPI implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(SPI.class);
    // SPI device
    private SpiDevice spi = null;




    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.info("-------:init SPI.");
        spi = spi = SpiFactory.getInstance(SpiChannel.CS0,
                30000000, //spi speed 10 MHz
                SpiDevice.DEFAULT_SPI_MODE); // default spi mode 0

        logger.info("-------:start SPI test.");
        String sendMsg = "This msg is send from RaspberryPi SPI_0,test turn:";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            sb.delete( 0, sb.length() );
            sb.append(sendMsg).append(i);
            logger.info("-------:["+i+"]send to SPI:"+sb.toString());
            byte[] result = spiReadWriteData(sb.toString().getBytes(StandardCharsets.UTF_8));
            logger.info("-------:recive from SPI:"+new String(result, "UTF-8"));
            Thread.sleep(1000);
        }
    }

    public byte[] spiReadWriteData(byte[] dataOut) throws IOException {

        // send conversion request to ADC chip via SPI channel
        byte[] result = spi.write(dataOut);

        return result;
    }


}
