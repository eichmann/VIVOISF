package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterRO_0000056Iterator theCourtReporterRO_0000056Iterator = (CourtReporterRO_0000056Iterator)findAncestorWithClass(this, CourtReporterRO_0000056Iterator.class);
			pageContext.getOut().print(theCourtReporterRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

