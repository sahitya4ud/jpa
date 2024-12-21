package springioc;

import org.springframework.context.annotation.Bean;

public class OracleConnectionService implements ConnectionService{


    private TCPConnectionService tcpConnectionService;

    public OracleConnectionService(TCPConnectionService tcpConnectionService){
        System.out.println("from oracle constructor");
        this.tcpConnectionService = tcpConnectionService;
    }

    @Override
    public NeoConnection getConnection(String url, String userName, String password) {

        NeoConnection conn = new NeoConnection("MysqlConnection");

        System.out.println("getConnection from oracle");
        tcpConnectionService.connect();
        return conn;
    }

    @Bean
    public TCPConnectionService tcpConnectionService(){
        return new TCPConnectionService();
    }

    @Bean
    public ConnectionService mysqlConnectionService(TCPConnectionService tcpConnectionService){

        return new MysqlConnectionService(tcpConnectionService());
    }

    @Bean
    public ConnectionService oracleConnectionService(TCPConnectionService tcpConnectionService){

        return new MysqlConnectionService(tcpConnectionService());
    }

}
