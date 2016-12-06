package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameCurrencyFRIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameCurrencyFRIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameCurrencyFRIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

