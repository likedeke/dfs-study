package like.cn.dfs.namenode;

import like.cn.dfs.common.utils.DefaultScheduler;
import like.cn.dfs.namenode.config.NameNodeConfig;
import like.cn.dfs.namenode.datanode.DataNodeManager;
import like.cn.dfs.namenode.filesystem.DiskNameSystem;
import like.cn.dfs.namenode.server.NameNodeHandler;
import like.cn.dfs.namenode.server.NameNodeServer;
import like.cn.dfs.namenode.server.UserManager;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author <a href="mailto:likelovec@gmail.com">like</a>
 * @date 2021/9/18 14:25
 */
public class NameNode {

    private final AtomicBoolean started = new AtomicBoolean(false);

    private final NameNodeServer nameNodeServer;
    private final NameNodeHandler nameNodeHandler;
    private final DefaultScheduler defaultScheduler;
    private final DiskNameSystem diskNameSystem;
    private final DataNodeManager dataNodeManager;
    private final UserManager userManager;

    public NameNode(NameNodeConfig nameNodeConfig) {
        this.defaultScheduler = new DefaultScheduler("NameNode-Scheduler-");
        this.userManager = new UserManager(nameNodeConfig, defaultScheduler);
        this.diskNameSystem = new DiskNameSystem(nameNodeConfig, defaultScheduler);
        this.dataNodeManager = new DataNodeManager(userManager, nameNodeConfig, defaultScheduler);
        this.nameNodeHandler = new NameNodeHandler(userManager, defaultScheduler, diskNameSystem, dataNodeManager);
        this.nameNodeServer = new NameNodeServer(nameNodeHandler, defaultScheduler, diskNameSystem);
    }

    public static void main(String[] args) {
        try {
            NameNodeConfig nameNodeConfig = NameNodeConfig.builder()
                    .port(2341)
                    .httpPort(8081)
                    .editLogFlushThreshold(NameNodeConfig.DEFAULT_EDITLOG_FLUSH_THRESHOLD)
                    .dataNodeHeartbeatTimeout(600000)
                    .replicaNum(1)
                    .dataNodeAliveCheckInterval(30000)
                    .nameNodeLaunchMode("single")
                    .nameNodeId(1)
                    .baseDir("/data/namenode")
                    .build();
            NameNode nameNode = new NameNode(nameNodeConfig);
            nameNode.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 启动nameNode
     * @exception Exception 异常
     */
    public void start() throws Exception {
        if (started.compareAndSet(false, true)) {
            nameNodeServer.start();
        }
    }

    public void shutdown() {
        if (started.compareAndSet(true, false)) {
            defaultScheduler.shutdown();
            nameNodeServer.shutdown();
        }
    }
}
