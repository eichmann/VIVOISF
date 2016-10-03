package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperProducerIterator theWorkingPaperProducerIterator = (WorkingPaperProducerIterator)findAncestorWithClass(this, WorkingPaperProducerIterator.class);
			pageContext.getOut().print(theWorkingPaperProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for producer tag ");
		}
		return SKIP_BODY;
	}
}

