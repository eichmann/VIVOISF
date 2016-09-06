package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperTranslatorIterator theWorkingPaperTranslatorIterator = (WorkingPaperTranslatorIterator)findAncestorWithClass(this, WorkingPaperTranslatorIterator.class);
			pageContext.getOut().print(theWorkingPaperTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for translator tag ");
		}
		return SKIP_BODY;
	}
}

