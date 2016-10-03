package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentPrefixNameIterator theGraduateStudent = (GraduateStudentPrefixNameIterator)findAncestorWithClass(this, GraduateStudentPrefixNameIterator.class);
			pageContext.getOut().print(theGraduateStudent.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

