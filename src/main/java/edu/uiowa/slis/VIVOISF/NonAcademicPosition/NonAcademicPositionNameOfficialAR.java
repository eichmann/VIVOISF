package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameOfficialARIterator theNonAcademicPosition = (NonAcademicPositionNameOfficialARIterator)findAncestorWithClass(this, NonAcademicPositionNameOfficialARIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

