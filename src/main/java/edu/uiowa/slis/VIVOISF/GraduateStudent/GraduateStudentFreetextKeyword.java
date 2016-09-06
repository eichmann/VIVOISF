package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentFreetextKeywordIterator theGraduateStudent = (GraduateStudentFreetextKeywordIterator)findAncestorWithClass(this, GraduateStudentFreetextKeywordIterator.class);
			pageContext.getOut().print(theGraduateStudent.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

