package cn.itcast.struts.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.struts.utils.UploadUtil;

public class UploadAction extends ActionSupport{

    private File resource;
    private String resourceContentType;
    private String resourceFileName;
    private InputStream inputstream;
	public File getResource() {
		return resource;
	}
	public void setResource(File resource) {
		this.resource = resource;
	}
    
    public String getResourceContentType() {
		return resourceContentType;
	}

	public void setResourceContentType(String resourceContentType) {
		this.resourceContentType = resourceContentType;
	}

	public String getResourceFileName() {
		return resourceFileName;
	}

	public void setResourceFileName(String resourceFileName) {
		this.resourceFileName = resourceFileName;
	}
    
	public InputStream getInputstream() {
		return inputstream;
	}
	public void setInputstream(InputStream inputstream) {
		this.inputstream = inputstream;
	}
	public String upload(){
    	String path = UploadUtil.saveUploadFile(this.getResource(), this.getResourceFileName());
        //将文件名保存到request中
    	ServletActionContext.getRequest().getSession().setAttribute("fileName", this.getResourceFileName());
    	//将文件的路径保存到request中
    	 ServletActionContext.getRequest().getSession().setAttribute("Path", path);
    	return null;
    }
	
	public String download() throws Exception{
		 String fileName = ServletActionContext.getRequest().getSession().getAttribute("fileName").toString();
		 String path = ServletActionContext.getRequest().getSession().getAttribute("Path").toString();
		fileName = URLEncoder.encode(fileName, "UTF-8");
		ActionContext.getContext().put("fileName", fileName);
		this.inputstream = new FileInputStream(new File(path));
		
		return "download";
	}
}
