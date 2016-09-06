package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaper theWorkingPaper = (WorkingPaper)findAncestorWithClass(this, WorkingPaper.class);
			if (!theWorkingPaper.commitNeeded) {
				pageContext.getOut().print(theWorkingPaper.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			WorkingPaper theWorkingPaper = (WorkingPaper)findAncestorWithClass(this, WorkingPaper.class);
			return theWorkingPaper.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing WorkingPaper for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			WorkingPaper theWorkingPaper = (WorkingPaper)findAncestorWithClass(this, WorkingPaper.class);
			theWorkingPaper.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for subjectURI tag ");
		}
	}
}

