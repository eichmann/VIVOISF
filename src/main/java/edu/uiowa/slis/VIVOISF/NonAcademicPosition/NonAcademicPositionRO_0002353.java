package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionRO_0002353Iterator theNonAcademicPositionRO_0002353Iterator = (NonAcademicPositionRO_0002353Iterator)findAncestorWithClass(this, NonAcademicPositionRO_0002353Iterator.class);
			pageContext.getOut().print(theNonAcademicPositionRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

