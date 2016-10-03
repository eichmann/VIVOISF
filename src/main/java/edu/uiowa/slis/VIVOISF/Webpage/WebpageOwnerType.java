package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageOwnerIterator theWebpageOwnerIterator = (WebpageOwnerIterator)findAncestorWithClass(this, WebpageOwnerIterator.class);
			pageContext.getOut().print(theWebpageOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for owner tag ");
		}
		return SKIP_BODY;
	}
}

