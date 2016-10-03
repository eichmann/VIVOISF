package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterOwnerIterator theCourtReporterOwnerIterator = (CourtReporterOwnerIterator)findAncestorWithClass(this, CourtReporterOwnerIterator.class);
			pageContext.getOut().print(theCourtReporterOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for owner tag ");
		}
		return SKIP_BODY;
	}
}

