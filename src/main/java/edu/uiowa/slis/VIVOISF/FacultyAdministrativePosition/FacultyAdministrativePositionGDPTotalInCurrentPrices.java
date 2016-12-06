package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionGDPTotalInCurrentPricesIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, FacultyAdministrativePositionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

