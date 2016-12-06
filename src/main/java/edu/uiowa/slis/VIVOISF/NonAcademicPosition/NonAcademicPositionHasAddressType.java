package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasAddressIterator theNonAcademicPositionHasAddressIterator = (NonAcademicPositionHasAddressIterator)findAncestorWithClass(this, NonAcademicPositionHasAddressIterator.class);
			pageContext.getOut().print(theNonAcademicPositionHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

