package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageContent currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageContentIterator theWebpage = (WebpageContentIterator)findAncestorWithClass(this, WebpageContentIterator.class);
			pageContext.getOut().print(theWebpage.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for content tag ");
		}
		return SKIP_BODY;
	}
}

