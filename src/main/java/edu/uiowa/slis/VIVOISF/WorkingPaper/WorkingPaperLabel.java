package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaper theWorkingPaper = (WorkingPaper)findAncestorWithClass(this, WorkingPaper.class);
			if (!theWorkingPaper.commitNeeded) {
				pageContext.getOut().print(theWorkingPaper.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			WorkingPaper theWorkingPaper = (WorkingPaper)findAncestorWithClass(this, WorkingPaper.class);
			return theWorkingPaper.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing WorkingPaper for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			WorkingPaper theWorkingPaper = (WorkingPaper)findAncestorWithClass(this, WorkingPaper.class);
			theWorkingPaper.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for label tag ");
		}
	}
}

