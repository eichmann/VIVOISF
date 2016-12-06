package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameCurrencyESIterator theNonAcademicPosition = (NonAcademicPositionNameCurrencyESIterator)findAncestorWithClass(this, NonAcademicPositionNameCurrencyESIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

