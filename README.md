# Prerequisite

Before we can start building the application, we need to have an OpenShift free account and client tools installed.

# Step 1: Create WildFly application

To create an application using client tools, type the following command:

    rhc create-app <app-name> jboss-wildfly-8 --scaling

This command creates an application *<app-name>* using *WildFly 8.2* cartridge with scalability option and clones the repository to *<app-name>* directory.

# Step 2: Delete Template Application Source code

OpenShift creates a template project that can be freely removed:

    git rm -rf .openshift deployments src README.md pom.xml

Commit the changes:

    git commit -am "Removed template application source code"

# Step 3: Pull Source code from GitHub

    git remote add upstream https://github.com/kolorobot/openshift-wildfly-spring-boot.git
    git pull -s recursive -X theirs upstream master

# Step 4: Push changes

The basic template is ready to be pushed to OpenShift:

	git push

The initial deployment (build and application startup) will take some time (up to several minutes). Subsequent deployments are a bit faster.


You can now browse to: `http://<app-name>-<domain>.rhcloud.com` and you should see home page with the form.

# Under the hood

@TODO Link to the blog post
