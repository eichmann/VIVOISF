package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionBFO_0000050Iterator theNonAcademicPositionBFO_0000050Iterator = (NonAcademicPositionBFO_0000050Iterator)findAncestorWithClass(this, NonAcademicPositionBFO_0000050Iterator.class);
			pageContext.getOut().print(theNonAcademicPositionBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

