package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherPopulationUnitIterator thePublisher = (PublisherPopulationUnitIterator)findAncestorWithClass(this, PublisherPopulationUnitIterator.class);
			pageContext.getOut().print(thePublisher.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

