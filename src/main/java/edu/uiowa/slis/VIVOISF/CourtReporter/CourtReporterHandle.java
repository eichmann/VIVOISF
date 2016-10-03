package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterHandleIterator theCourtReporter = (CourtReporterHandleIterator)findAncestorWithClass(this, CourtReporterHandleIterator.class);
			pageContext.getOut().print(theCourtReporter.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for handle tag ");
		}
		return SKIP_BODY;
	}
}

