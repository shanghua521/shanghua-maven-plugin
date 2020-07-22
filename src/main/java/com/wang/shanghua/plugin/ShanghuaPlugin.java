package com.wang.shanghua.plugin;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "shanghua")
public class ShanghuaPlugin extends AbstractMojo {
    @Parameter
    String sex;
    @Parameter
    String describe;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(String.format("shanghua sex=%s,describe=%s", sex, describe));
    }
}
