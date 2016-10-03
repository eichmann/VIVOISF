package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterUpcIterator theCourtReporter = (CourtReporterUpcIterator)findAncestorWithClass(this, CourtReporterUpcIterator.class);
			pageContext.getOut().print(theCourtReporter.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for upc tag ");
		}
		return SKIP_BODY;
	}
}

