package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentRO_0001025Iterator theGraduateStudentRO_0001025Iterator = (GraduateStudentRO_0001025Iterator)findAncestorWithClass(this, GraduateStudentRO_0001025Iterator.class);
			pageContext.getOut().print(theGraduateStudentRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

