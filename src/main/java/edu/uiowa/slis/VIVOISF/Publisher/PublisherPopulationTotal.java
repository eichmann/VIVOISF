package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherPopulationTotalIterator thePublisher = (PublisherPopulationTotalIterator)findAncestorWithClass(this, PublisherPopulationTotalIterator.class);
			pageContext.getOut().print(thePublisher.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

