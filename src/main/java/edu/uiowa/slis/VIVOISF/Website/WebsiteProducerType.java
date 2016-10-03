package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteProducerIterator theWebsiteProducerIterator = (WebsiteProducerIterator)findAncestorWithClass(this, WebsiteProducerIterator.class);
			pageContext.getOut().print(theWebsiteProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for producer tag ");
		}
		return SKIP_BODY;
	}
}

