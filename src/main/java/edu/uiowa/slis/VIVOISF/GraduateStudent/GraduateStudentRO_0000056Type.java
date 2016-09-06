package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentRO_0000056Iterator theGraduateStudentRO_0000056Iterator = (GraduateStudentRO_0000056Iterator)findAncestorWithClass(this, GraduateStudentRO_0000056Iterator.class);
			pageContext.getOut().print(theGraduateStudentRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

