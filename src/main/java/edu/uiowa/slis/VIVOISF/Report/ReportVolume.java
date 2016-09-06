package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportVolumeIterator theReport = (ReportVolumeIterator)findAncestorWithClass(this, ReportVolumeIterator.class);
			pageContext.getOut().print(theReport.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for volume tag ");
		}
		return SKIP_BODY;
	}
}

