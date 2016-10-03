package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportEditorListIterator theReportEditorListIterator = (ReportEditorListIterator)findAncestorWithClass(this, ReportEditorListIterator.class);
			pageContext.getOut().print(theReportEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for editorList tag ");
		}
		return SKIP_BODY;
	}
}

