package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicARG_2000028Iterator theNonAcademicARG_2000028Iterator = (NonAcademicARG_2000028Iterator)findAncestorWithClass(this, NonAcademicARG_2000028Iterator.class);
			pageContext.getOut().print(theNonAcademicARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

