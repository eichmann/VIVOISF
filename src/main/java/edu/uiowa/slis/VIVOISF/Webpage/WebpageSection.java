package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageSection currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageSectionIterator theWebpage = (WebpageSectionIterator)findAncestorWithClass(this, WebpageSectionIterator.class);
			pageContext.getOut().print(theWebpage.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for section tag ");
		}
		return SKIP_BODY;
	}
}

