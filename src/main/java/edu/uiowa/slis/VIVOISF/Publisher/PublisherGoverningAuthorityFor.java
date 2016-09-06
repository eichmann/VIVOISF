package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherGoverningAuthorityForIterator thePublisherGoverningAuthorityForIterator = (PublisherGoverningAuthorityForIterator)findAncestorWithClass(this, PublisherGoverningAuthorityForIterator.class);
			pageContext.getOut().print(thePublisherGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

