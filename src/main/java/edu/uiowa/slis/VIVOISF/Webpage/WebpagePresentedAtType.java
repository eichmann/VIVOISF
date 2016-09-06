package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpagePresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpagePresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpagePresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpagePresentedAtIterator theWebpagePresentedAtIterator = (WebpagePresentedAtIterator)findAncestorWithClass(this, WebpagePresentedAtIterator.class);
			pageContext.getOut().print(theWebpagePresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

