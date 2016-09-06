package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperReproducedInIterator theWorkingPaperReproducedInIterator = (WorkingPaperReproducedInIterator)findAncestorWithClass(this, WorkingPaperReproducedInIterator.class);
			pageContext.getOut().print(theWorkingPaperReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

