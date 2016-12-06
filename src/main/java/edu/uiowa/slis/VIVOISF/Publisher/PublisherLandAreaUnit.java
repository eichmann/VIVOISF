package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherLandAreaUnitIterator thePublisher = (PublisherLandAreaUnitIterator)findAncestorWithClass(this, PublisherLandAreaUnitIterator.class);
			pageContext.getOut().print(thePublisher.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

