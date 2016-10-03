package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageSici currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageSiciIterator theWebpage = (WebpageSiciIterator)findAncestorWithClass(this, WebpageSiciIterator.class);
			pageContext.getOut().print(theWebpage.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for sici tag ");
		}
		return SKIP_BODY;
	}
}

