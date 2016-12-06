package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionBFO_0000051Iterator theNonAcademicPositionBFO_0000051Iterator = (NonAcademicPositionBFO_0000051Iterator)findAncestorWithClass(this, NonAcademicPositionBFO_0000051Iterator.class);
			pageContext.getOut().print(theNonAcademicPositionBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

