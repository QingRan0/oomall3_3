#!/bin/bash

# 启动 Gateway 服务
docker service create \
  --name gateway \
  --network my-net \
  --constraint 'node.labels.server==node0' \
  --publish published=8080,target=8080 \
  --mount type=bind,source=/root/logs,destination=/app/logs \
  -d xmu-oomall/gateway:0.0.1-SNAPSHOT

# 启动 Product 服务
docker service create \
  --name product \
  --network my-net \
  --constraint 'node.labels.server==node0' \
  --mount type=bind,source=/root/logs,destination=/app/logs \
  -d xmu-oomall/product:0.0.1-SNAPSHOT

# 启动 Payment 服务
docker service create \
  --name payment \
  --network my-net \
  --constraint 'node.labels.server==node0' \
  --mount type=bind,source=/root/logs,destination=/app/logs \
  -d xmu-oomall/payment:0.0.1-SNAPSHOT

# 启动 Shop 服务
docker service create \
  --name shop \
  --network my-net \
  --constraint 'node.labels.server==node0' \
  --mount type=bind,source=/root/logs,destination=/app/logs \
  -d xmu-oomall/shop:0.0.1-SNAPSHOT

# 启动 Region 服务
docker service create \
  --name region \
  --network my-net \
  --constraint 'node.labels.server==node0' \
  --mount type=bind,source=/root/logs,destination=/app/logs \
  -d xmu-oomall/region:0.0.1-SNAPSHOT

# 启动 Alipay 服务
docker service create \
  --name alipay \
  --network my-net \
  --constraint 'node.labels.server==node0' \
  --mount type=bind,source=/root/logs,destination=/app/logs \
  -d xmu-oomall/alipay:0.0.1-SNAPSHOT

# 启动 Wechatpay 服务
docker service create \
  --name wechatpay \
  --network my-net \
  --constraint 'node.labels.server==node0' \
  --mount type=bind,source=/root/logs,destination=/app/logs \
  -d xmu-oomall/wechatpay:0.0.1-SNAPSHOT

# 启动 Freight 服务
docker service create \
  --name freight \
  --network my-net \
  --constraint 'node.labels.server==node0' \
  --mount type=bind,source=/root/logs,destination=/app/logs \
  -d xmu-oomall/freight:0.0.1-SNAPSHOT

echo "All services have been deployed to node0."
