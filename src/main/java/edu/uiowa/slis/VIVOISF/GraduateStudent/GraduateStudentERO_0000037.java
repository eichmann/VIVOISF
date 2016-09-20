package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentERO_0000037Iterator theGraduateStudentERO_0000037Iterator = (GraduateStudentERO_0000037Iterator)findAncestorWithClass(this, GraduateStudentERO_0000037Iterator.class);
			pageContext.getOut().print(theGraduateStudentERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

