package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageOclcnumIterator theWebpage = (WebpageOclcnumIterator)findAncestorWithClass(this, WebpageOclcnumIterator.class);
			pageContext.getOut().print(theWebpage.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

