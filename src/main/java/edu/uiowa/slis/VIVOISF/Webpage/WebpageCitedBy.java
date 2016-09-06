package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageCitedByIterator theWebpageCitedByIterator = (WebpageCitedByIterator)findAncestorWithClass(this, WebpageCitedByIterator.class);
			pageContext.getOut().print(theWebpageCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

