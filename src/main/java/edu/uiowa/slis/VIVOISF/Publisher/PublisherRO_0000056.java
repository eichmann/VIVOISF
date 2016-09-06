package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherRO_0000056Iterator thePublisherRO_0000056Iterator = (PublisherRO_0000056Iterator)findAncestorWithClass(this, PublisherRO_0000056Iterator.class);
			pageContext.getOut().print(thePublisherRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

