package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterIAO_0000136Iterator theCourtReporterIAO_0000136Iterator = (CourtReporterIAO_0000136Iterator)findAncestorWithClass(this, CourtReporterIAO_0000136Iterator.class);
			pageContext.getOut().print(theCourtReporterIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

