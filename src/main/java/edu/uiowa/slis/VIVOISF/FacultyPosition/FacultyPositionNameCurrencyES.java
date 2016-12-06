package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameCurrencyESIterator theFacultyPosition = (FacultyPositionNameCurrencyESIterator)findAncestorWithClass(this, FacultyPositionNameCurrencyESIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

