package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameCurrencyRUIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameCurrencyRUIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameCurrencyRUIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

