package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameCurrencyENIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameCurrencyENIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameCurrencyENIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

