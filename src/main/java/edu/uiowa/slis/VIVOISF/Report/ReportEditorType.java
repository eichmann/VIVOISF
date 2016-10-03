package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportEditorIterator theReportEditorIterator = (ReportEditorIterator)findAncestorWithClass(this, ReportEditorIterator.class);
			pageContext.getOut().print(theReportEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for editor tag ");
		}
		return SKIP_BODY;
	}
}

