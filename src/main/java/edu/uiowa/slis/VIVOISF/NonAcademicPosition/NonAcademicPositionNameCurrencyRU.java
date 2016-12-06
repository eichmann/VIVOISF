package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameCurrencyRUIterator theNonAcademicPosition = (NonAcademicPositionNameCurrencyRUIterator)findAncestorWithClass(this, NonAcademicPositionNameCurrencyRUIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

