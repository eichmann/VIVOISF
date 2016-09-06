package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageStatusIterator theWebpageStatusIterator = (WebpageStatusIterator)findAncestorWithClass(this, WebpageStatusIterator.class);
			pageContext.getOut().print(theWebpageStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for status tag ");
		}
		return SKIP_BODY;
	}
}

