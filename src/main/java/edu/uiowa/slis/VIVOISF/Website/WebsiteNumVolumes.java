package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteNumVolumes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteNumVolumes currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteNumVolumes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteNumVolumesIterator theWebsite = (WebsiteNumVolumesIterator)findAncestorWithClass(this, WebsiteNumVolumesIterator.class);
			pageContext.getOut().print(theWebsite.getNumVolumes());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for numVolumes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for numVolumes tag ");
		}
		return SKIP_BODY;
	}
}

