package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionRO_0001025Iterator theNonAcademicPositionRO_0001025Iterator = (NonAcademicPositionRO_0001025Iterator)findAncestorWithClass(this, NonAcademicPositionRO_0001025Iterator.class);
			pageContext.getOut().print(theNonAcademicPositionRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}
