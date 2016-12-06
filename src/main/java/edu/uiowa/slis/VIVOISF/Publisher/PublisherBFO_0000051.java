package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherBFO_0000051Iterator thePublisherBFO_0000051Iterator = (PublisherBFO_0000051Iterator)findAncestorWithClass(this, PublisherBFO_0000051Iterator.class);
			pageContext.getOut().print(thePublisherBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

