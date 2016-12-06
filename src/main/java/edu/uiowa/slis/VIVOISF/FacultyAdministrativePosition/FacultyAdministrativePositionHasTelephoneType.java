package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasTelephoneIterator theFacultyAdministrativePositionHasTelephoneIterator = (FacultyAdministrativePositionHasTelephoneIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasTelephoneIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}
