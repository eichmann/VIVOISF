package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteOclcnumIterator theWebsite = (WebsiteOclcnumIterator)findAncestorWithClass(this, WebsiteOclcnumIterator.class);
			pageContext.getOut().print(theWebsite.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

