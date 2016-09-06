package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperTranslationOfIterator theWorkingPaperTranslationOfIterator = (WorkingPaperTranslationOfIterator)findAncestorWithClass(this, WorkingPaperTranslationOfIterator.class);
			pageContext.getOut().print(theWorkingPaperTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

