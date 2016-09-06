package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			if (!theUndergraduateStudent.commitNeeded) {
				pageContext.getOut().print(theUndergraduateStudent.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			return theUndergraduateStudent.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing UndergraduateStudent for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			UndergraduateStudent theUndergraduateStudent = (UndergraduateStudent)findAncestorWithClass(this, UndergraduateStudent.class);
			theUndergraduateStudent.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for outreachOverview tag ");
		}
	}
}

