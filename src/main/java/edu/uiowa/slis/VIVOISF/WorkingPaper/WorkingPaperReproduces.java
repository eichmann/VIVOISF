package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperReproducesIterator theWorkingPaperReproducesIterator = (WorkingPaperReproducesIterator)findAncestorWithClass(this, WorkingPaperReproducesIterator.class);
			pageContext.getOut().print(theWorkingPaperReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

