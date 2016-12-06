package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameCurrencyITIterator theNonAcademicPosition = (NonAcademicPositionNameCurrencyITIterator)findAncestorWithClass(this, NonAcademicPositionNameCurrencyITIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

