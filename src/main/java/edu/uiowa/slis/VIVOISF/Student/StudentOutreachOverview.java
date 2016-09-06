package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			if (!theStudent.commitNeeded) {
				pageContext.getOut().print(theStudent.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Student for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			return theStudent.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Student for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			Student theStudent = (Student)findAncestorWithClass(this, Student.class);
			theStudent.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Student for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for outreachOverview tag ");
		}
	}
}

