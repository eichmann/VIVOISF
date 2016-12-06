package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameCurrencyITIterator theFacultyPosition = (FacultyPositionNameCurrencyITIterator)findAncestorWithClass(this, FacultyPositionNameCurrencyITIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

