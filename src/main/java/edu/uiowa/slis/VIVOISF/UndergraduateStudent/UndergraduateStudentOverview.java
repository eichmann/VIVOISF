package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			if (!theUndergraduateStudent.commitNeeded) {
				pageContext.getOut().print(theUndergraduateStudent.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			return theUndergraduateStudent.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing UndergraduateStudent for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			theUndergraduateStudent.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for overview tag ");
		}
	}
}

