package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperFeaturesIterator theWorkingPaperFeaturesIterator = (WorkingPaperFeaturesIterator)findAncestorWithClass(this, WorkingPaperFeaturesIterator.class);
			pageContext.getOut().print(theWorkingPaperFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for features tag ");
		}
		return SKIP_BODY;
	}
}

