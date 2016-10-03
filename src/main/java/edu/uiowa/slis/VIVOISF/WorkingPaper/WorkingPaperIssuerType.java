package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperIssuerIterator theWorkingPaperIssuerIterator = (WorkingPaperIssuerIterator)findAncestorWithClass(this, WorkingPaperIssuerIterator.class);
			pageContext.getOut().print(theWorkingPaperIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for issuer tag ");
		}
		return SKIP_BODY;
	}
}

