package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportARG_2000028Iterator theReportARG_2000028Iterator = (ReportARG_2000028Iterator)findAncestorWithClass(this, ReportARG_2000028Iterator.class);
			pageContext.getOut().print(theReportARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

