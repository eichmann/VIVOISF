package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherRO_0002353Iterator thePublisherRO_0002353Iterator = (PublisherRO_0002353Iterator)findAncestorWithClass(this, PublisherRO_0002353Iterator.class);
			pageContext.getOut().print(thePublisherRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

