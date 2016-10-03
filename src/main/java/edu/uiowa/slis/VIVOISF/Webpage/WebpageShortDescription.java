package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageShortDescriptionIterator theWebpage = (WebpageShortDescriptionIterator)findAncestorWithClass(this, WebpageShortDescriptionIterator.class);
			pageContext.getOut().print(theWebpage.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

