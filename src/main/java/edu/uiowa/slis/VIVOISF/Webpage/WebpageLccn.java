package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageLccnIterator theWebpage = (WebpageLccnIterator)findAncestorWithClass(this, WebpageLccnIterator.class);
			pageContext.getOut().print(theWebpage.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for lccn tag ");
		}
		return SKIP_BODY;
	}
}

