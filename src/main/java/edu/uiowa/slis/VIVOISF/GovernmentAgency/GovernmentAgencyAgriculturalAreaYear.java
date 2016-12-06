package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyAgriculturalAreaYearIterator theGovernmentAgency = (GovernmentAgencyAgriculturalAreaYearIterator)findAncestorWithClass(this, GovernmentAgencyAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

