package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterIsbn10Iterator theCourtReporter = (CourtReporterIsbn10Iterator)findAncestorWithClass(this, CourtReporterIsbn10Iterator.class);
			pageContext.getOut().print(theCourtReporter.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

