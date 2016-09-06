package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageDoiIterator theWebpage = (WebpageDoiIterator)findAncestorWithClass(this, WebpageDoiIterator.class);
			pageContext.getOut().print(theWebpage.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for doi tag ");
		}
		return SKIP_BODY;
	}
}

