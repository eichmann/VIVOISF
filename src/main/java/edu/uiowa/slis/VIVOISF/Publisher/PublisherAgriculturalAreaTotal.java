package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherAgriculturalAreaTotalIterator thePublisher = (PublisherAgriculturalAreaTotalIterator)findAncestorWithClass(this, PublisherAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(thePublisher.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

