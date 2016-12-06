package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherAgriculturalAreaUnitIterator thePublisher = (PublisherAgriculturalAreaUnitIterator)findAncestorWithClass(this, PublisherAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(thePublisher.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

