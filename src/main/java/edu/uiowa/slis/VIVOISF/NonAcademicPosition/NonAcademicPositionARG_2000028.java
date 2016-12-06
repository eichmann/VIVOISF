package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionARG_2000028Iterator theNonAcademicPositionARG_2000028Iterator = (NonAcademicPositionARG_2000028Iterator)findAncestorWithClass(this, NonAcademicPositionARG_2000028Iterator.class);
			pageContext.getOut().print(theNonAcademicPositionARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

