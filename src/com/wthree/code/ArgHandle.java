package com.wthree.code;
import java.io.File;




public class ArgHandle extends ToolBase {
    protected File dir;
    protected int port;

    // Getters
    public File getDir() {
        return dir;
    }

    public void setInt(int value) {
		// TODO Auto-generated method stub
		
	}

	public String[] getTagArgs() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDir(File dir) {
		// TODO Auto-generated method stub
		
	}

	public int getPort() {
        return port;
    }

    public ArgHandle() {
        this.registerHandler(new ArgHandle() {
            @Override
            public void setDir(File dir) {
                ArgHandle.this.dir = dir;  // Fix: use outer class reference
            }
        });

        this.registerHandler(new ArgHandle() {
            @Override
            public String[] getTagArgs() {
                return new String[]{"port"};
            }

            @Override
            public void setInt(int value) {
                ArgHandle.this.port = value;  // Fix: use outer class reference
            }
        });
    }

    public static void main(String[] args) {
        ArgHandle myShell = new ArgHandle();
        if (myShell.processArgs(args)) {
            // Main program logic
            System.out.printf("port: %d; dir: %s%n", myShell.getPort(), myShell.getDir());
            System.exit(0); // success
        }
        System.exit(1); // failure
    }
}
