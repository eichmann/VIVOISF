package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameCurrencyITIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameCurrencyITIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameCurrencyITIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

