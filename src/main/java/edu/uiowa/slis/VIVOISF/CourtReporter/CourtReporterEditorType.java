package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterEditorIterator theCourtReporterEditorIterator = (CourtReporterEditorIterator)findAncestorWithClass(this, CourtReporterEditorIterator.class);
			pageContext.getOut().print(theCourtReporterEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for editor tag ");
		}
		return SKIP_BODY;
	}
}

