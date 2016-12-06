package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNationalityFRIterator theGovernmentAgency = (GovernmentAgencyNationalityFRIterator)findAncestorWithClass(this, GovernmentAgencyNationalityFRIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

