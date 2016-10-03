package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentSuffixNameIterator theGraduateStudent = (GraduateStudentSuffixNameIterator)findAncestorWithClass(this, GraduateStudentSuffixNameIterator.class);
			pageContext.getOut().print(theGraduateStudent.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

