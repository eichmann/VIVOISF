package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameCurrencyFRIterator theFacultyPosition = (FacultyPositionNameCurrencyFRIterator)findAncestorWithClass(this, FacultyPositionNameCurrencyFRIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

