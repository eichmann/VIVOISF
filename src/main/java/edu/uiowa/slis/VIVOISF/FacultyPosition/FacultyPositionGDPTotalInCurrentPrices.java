package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionGDPTotalInCurrentPricesIterator theFacultyPosition = (FacultyPositionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, FacultyPositionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theFacultyPosition.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

