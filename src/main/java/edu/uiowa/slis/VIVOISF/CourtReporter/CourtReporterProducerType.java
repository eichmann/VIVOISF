package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterProducerIterator theCourtReporterProducerIterator = (CourtReporterProducerIterator)findAncestorWithClass(this, CourtReporterProducerIterator.class);
			pageContext.getOut().print(theCourtReporterProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for producer tag ");
		}
		return SKIP_BODY;
	}
}

