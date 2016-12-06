package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameCurrencyRUIterator theFacultyPosition = (FacultyPositionNameCurrencyRUIterator)findAncestorWithClass(this, FacultyPositionNameCurrencyRUIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

