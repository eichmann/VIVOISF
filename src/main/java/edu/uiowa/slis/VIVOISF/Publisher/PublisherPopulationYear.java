package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherPopulationYearIterator thePublisher = (PublisherPopulationYearIterator)findAncestorWithClass(this, PublisherPopulationYearIterator.class);
			pageContext.getOut().print(thePublisher.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

