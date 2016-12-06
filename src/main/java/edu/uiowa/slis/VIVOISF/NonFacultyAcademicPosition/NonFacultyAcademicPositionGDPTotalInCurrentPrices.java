package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionGDPTotalInCurrentPricesIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, NonFacultyAcademicPositionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

