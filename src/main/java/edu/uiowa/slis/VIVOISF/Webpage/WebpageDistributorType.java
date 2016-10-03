package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageDistributorIterator theWebpageDistributorIterator = (WebpageDistributorIterator)findAncestorWithClass(this, WebpageDistributorIterator.class);
			pageContext.getOut().print(theWebpageDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for distributor tag ");
		}
		return SKIP_BODY;
	}
}

