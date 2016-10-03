package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteEissnIterator theWebsite = (WebsiteEissnIterator)findAncestorWithClass(this, WebsiteEissnIterator.class);
			pageContext.getOut().print(theWebsite.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for eissn tag ");
		}
		return SKIP_BODY;
	}
}

