FROM jenkins/jenkins:lts

USER root
RUN apt-get update && apt-get install -y git && rm -rf /var/lib/apt/lists/*
RUN mkdir -p /usr/share/jenkins/ref/init.groovy.d/
COPY hello-world-job.groovy /usr/share/jenkins/ref/init.groovy.d/
RUN chown -R jenkins:jenkins /usr/share/jenkins/ref/init.groovy.d/
USER jenkins
EXPOSE 8080

ENTRYPOINT ["/usr/bin/tini", "--", "/usr/local/bin/jenkins.sh"]