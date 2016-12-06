package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionGDPTotalInCurrentPricesIterator theNonAcademicPosition = (NonAcademicPositionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, NonAcademicPositionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

