package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpagePresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpagePresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpagePresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpagePresentedAtIterator theWebpagePresentedAtIterator = (WebpagePresentedAtIterator)findAncestorWithClass(this, WebpagePresentedAtIterator.class);
			pageContext.getOut().print(theWebpagePresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

