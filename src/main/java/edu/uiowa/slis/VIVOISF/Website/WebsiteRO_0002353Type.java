package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteRO_0002353Iterator theWebsiteRO_0002353Iterator = (WebsiteRO_0002353Iterator)findAncestorWithClass(this, WebsiteRO_0002353Iterator.class);
			pageContext.getOut().print(theWebsiteRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

