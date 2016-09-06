package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicRO_0001025Iterator theNonAcademicRO_0001025Iterator = (NonAcademicRO_0001025Iterator)findAncestorWithClass(this, NonAcademicRO_0001025Iterator.class);
			pageContext.getOut().print(theNonAcademicRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

