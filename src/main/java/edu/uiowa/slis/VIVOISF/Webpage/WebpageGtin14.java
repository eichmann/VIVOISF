package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageGtin14Iterator theWebpage = (WebpageGtin14Iterator)findAncestorWithClass(this, WebpageGtin14Iterator.class);
			pageContext.getOut().print(theWebpage.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

