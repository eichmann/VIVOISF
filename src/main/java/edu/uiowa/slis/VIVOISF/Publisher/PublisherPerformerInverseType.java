package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherPerformerInverseIterator thePublisherPerformerInverseIterator = (PublisherPerformerInverseIterator)findAncestorWithClass(this, PublisherPerformerInverseIterator.class);
			pageContext.getOut().print(thePublisherPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for performer tag ");
		}
		return SKIP_BODY;
	}
}

