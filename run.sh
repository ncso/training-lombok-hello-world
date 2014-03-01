#!/bin/sh

set -eu
die(){ echo $2; exit $1; }

. /opt/ber211/current/profile
. /opt/jstdtools/current/profile

export PATH="${M2_HOME}/bin:${ANT19_HOME}/bin:$PATH"
export MAVEN_OPTS="-Xmx512m -XX:MaxPermSize=128m -ea"

mvn --offline --fail-fast -Dmdep.outputFile=mdep.classpath \
    dependency:build-classpath \
    clean compile package

CLASSPATH=target/classes
CLASSPATH=${CLASSPATH}:`cat mdep.classpath`
export CLASSPATH
echo -n "$CLASSPATH" | perl -072 -l012 -pe1

# java -ea \
#     -Dcom.acme.log.class=com.acme.log.StdErrLog \
#     -Dcom.acme.labs.Application.LEVEL=DEBUG \
#     com.acme.labs.Application

java -ea com.acme.labs.Application

echo "all done"
