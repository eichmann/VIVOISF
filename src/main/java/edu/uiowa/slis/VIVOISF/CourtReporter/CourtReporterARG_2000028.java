package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterARG_2000028Iterator theCourtReporterARG_2000028Iterator = (CourtReporterARG_2000028Iterator)findAncestorWithClass(this, CourtReporterARG_2000028Iterator.class);
			pageContext.getOut().print(theCourtReporterARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

