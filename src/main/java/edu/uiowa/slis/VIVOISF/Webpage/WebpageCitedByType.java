package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageCitedByIterator theWebpageCitedByIterator = (WebpageCitedByIterator)findAncestorWithClass(this, WebpageCitedByIterator.class);
			pageContext.getOut().print(theWebpageCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

