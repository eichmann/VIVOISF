package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteLccnIterator theWebsite = (WebsiteLccnIterator)findAncestorWithClass(this, WebsiteLccnIterator.class);
			pageContext.getOut().print(theWebsite.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for lccn tag ");
		}
		return SKIP_BODY;
	}
}

