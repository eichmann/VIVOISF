package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameCurrencyENIterator theFacultyPosition = (FacultyPositionNameCurrencyENIterator)findAncestorWithClass(this, FacultyPositionNameCurrencyENIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

