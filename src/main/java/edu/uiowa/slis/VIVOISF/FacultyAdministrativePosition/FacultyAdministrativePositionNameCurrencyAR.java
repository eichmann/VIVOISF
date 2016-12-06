package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameCurrencyARIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameCurrencyARIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameCurrencyARIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

