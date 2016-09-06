package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteDateTimeValueIterator theWebsiteDateTimeValueIterator = (WebsiteDateTimeValueIterator)findAncestorWithClass(this, WebsiteDateTimeValueIterator.class);
			pageContext.getOut().print(theWebsiteDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

