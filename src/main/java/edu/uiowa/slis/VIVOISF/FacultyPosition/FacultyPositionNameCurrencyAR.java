package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameCurrencyARIterator theFacultyPosition = (FacultyPositionNameCurrencyARIterator)findAncestorWithClass(this, FacultyPositionNameCurrencyARIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

