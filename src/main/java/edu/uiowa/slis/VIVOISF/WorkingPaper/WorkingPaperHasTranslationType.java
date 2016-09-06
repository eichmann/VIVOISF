package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperHasTranslationIterator theWorkingPaperHasTranslationIterator = (WorkingPaperHasTranslationIterator)findAncestorWithClass(this, WorkingPaperHasTranslationIterator.class);
			pageContext.getOut().print(theWorkingPaperHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

