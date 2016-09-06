package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageCites currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageCitesIterator theWebpageCitesIterator = (WebpageCitesIterator)findAncestorWithClass(this, WebpageCitesIterator.class);
			pageContext.getOut().print(theWebpageCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for cites tag ");
		}
		return SKIP_BODY;
	}
}

