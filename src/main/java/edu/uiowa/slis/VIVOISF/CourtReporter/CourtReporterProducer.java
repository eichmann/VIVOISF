package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterProducerIterator theCourtReporterProducerIterator = (CourtReporterProducerIterator)findAncestorWithClass(this, CourtReporterProducerIterator.class);
			pageContext.getOut().print(theCourtReporterProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for producer tag ");
		}
		return SKIP_BODY;
	}
}

