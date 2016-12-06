package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasTelephoneIterator theNonAcademicPositionHasTelephoneIterator = (NonAcademicPositionHasTelephoneIterator)findAncestorWithClass(this, NonAcademicPositionHasTelephoneIterator.class);
			pageContext.getOut().print(theNonAcademicPositionHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

