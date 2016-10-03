package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteIssnIterator theWebsite = (WebsiteIssnIterator)findAncestorWithClass(this, WebsiteIssnIterator.class);
			pageContext.getOut().print(theWebsite.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for issn tag ");
		}
		return SKIP_BODY;
	}
}

