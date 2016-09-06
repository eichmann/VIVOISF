package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteTranslatorIterator theWebsiteTranslatorIterator = (WebsiteTranslatorIterator)findAncestorWithClass(this, WebsiteTranslatorIterator.class);
			pageContext.getOut().print(theWebsiteTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for translator tag ");
		}
		return SKIP_BODY;
	}
}

