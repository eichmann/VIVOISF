package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportProducerIterator theReportProducerIterator = (ReportProducerIterator)findAncestorWithClass(this, ReportProducerIterator.class);
			pageContext.getOut().print(theReportProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for producer tag ");
		}
		return SKIP_BODY;
	}
}

