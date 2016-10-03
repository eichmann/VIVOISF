package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteEanucc13Iterator theWebsite = (WebsiteEanucc13Iterator)findAncestorWithClass(this, WebsiteEanucc13Iterator.class);
			pageContext.getOut().print(theWebsite.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

