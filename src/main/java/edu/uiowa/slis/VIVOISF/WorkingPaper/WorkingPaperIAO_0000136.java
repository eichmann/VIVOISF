package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperIAO_0000136Iterator theWorkingPaperIAO_0000136Iterator = (WorkingPaperIAO_0000136Iterator)findAncestorWithClass(this, WorkingPaperIAO_0000136Iterator.class);
			pageContext.getOut().print(theWorkingPaperIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

