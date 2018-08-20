package com.neotys.xebialabs.xl;

/**
 * Created by hrexed on 16/02/18.
 */
public class CloudResponse {
	private int responseCode;
    private String stdout;
    private String stderr;
    protected String ymlContent;

    CloudResponse(String content, int responseCode) {
        this.ymlContent = content;
        this.responseCode = responseCode;
    }

	public String getStdout() {
		return stdout;
	}

	public String getStderr() {
		return stderr;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public String getYmlContent() {
		return ymlContent;
	}

	void addToOut(StringBuilder s) {
        this.stdout += "\n" + s.toString();
    }

    void addToError(StringBuilder s) {
        this.stderr += "\n" + s.toString();
    }
}