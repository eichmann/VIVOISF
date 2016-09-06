package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperRO_0000056Iterator theWorkingPaperRO_0000056Iterator = (WorkingPaperRO_0000056Iterator)findAncestorWithClass(this, WorkingPaperRO_0000056Iterator.class);
			pageContext.getOut().print(theWorkingPaperRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

