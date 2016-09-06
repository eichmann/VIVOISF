package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterTheAbstractIterator theCourtReporter = (CourtReporterTheAbstractIterator)findAncestorWithClass(this, CourtReporterTheAbstractIterator.class);
			pageContext.getOut().print(theCourtReporter.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

