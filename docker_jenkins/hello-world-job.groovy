import jenkins.model.*
import hudson.model.*
import hudson.tasks.Shell

def jobName = "Hello-World"

if (Jenkins.instance.getItem(jobName) == null) {
    println "Creating job: ${jobName}"
    
    def job = Jenkins.instance.createProject(FreeStyleProject, jobName)
    
    job.buildersList.add(new Shell("echo 'Hello, World!'"))
    
    job.save()
    println "Job ${jobName} created successfully!"
} else {
    println "Job ${jobName} already exists."
}
