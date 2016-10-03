package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterNumVolumes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterNumVolumes currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterNumVolumes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterNumVolumesIterator theCourtReporter = (CourtReporterNumVolumesIterator)findAncestorWithClass(this, CourtReporterNumVolumesIterator.class);
			pageContext.getOut().print(theCourtReporter.getNumVolumes());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for numVolumes tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for numVolumes tag ");
		}
		return SKIP_BODY;
	}
}

