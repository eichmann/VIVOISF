package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherGDPUnitIterator thePublisher = (PublisherGDPUnitIterator)findAncestorWithClass(this, PublisherGDPUnitIterator.class);
			pageContext.getOut().print(thePublisher.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

