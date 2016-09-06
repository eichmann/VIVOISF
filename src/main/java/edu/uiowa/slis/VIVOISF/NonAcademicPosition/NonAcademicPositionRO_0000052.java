package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionRO_0000052Iterator theNonAcademicPositionRO_0000052Iterator = (NonAcademicPositionRO_0000052Iterator)findAncestorWithClass(this, NonAcademicPositionRO_0000052Iterator.class);
			pageContext.getOut().print(theNonAcademicPositionRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

