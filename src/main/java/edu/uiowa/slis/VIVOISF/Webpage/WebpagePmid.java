package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpagePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpagePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpagePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpagePmidIterator theWebpage = (WebpagePmidIterator)findAncestorWithClass(this, WebpagePmidIterator.class);
			pageContext.getOut().print(theWebpage.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for pmid tag ");
		}
		return SKIP_BODY;
	}
}

