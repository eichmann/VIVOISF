package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentERO_0000397Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentERO_0000397Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentERO_0000397Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentERO_0000397Iterator theGraduateStudentERO_0000397Iterator = (GraduateStudentERO_0000397Iterator)findAncestorWithClass(this, GraduateStudentERO_0000397Iterator.class);
			pageContext.getOut().print(theGraduateStudentERO_0000397Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

