package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameCurrencyZHIterator theFacultyPosition = (FacultyPositionNameCurrencyZHIterator)findAncestorWithClass(this, FacultyPositionNameCurrencyZHIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

