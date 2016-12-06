package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNationalityITIterator theGovernmentAgency = (GovernmentAgencyNationalityITIterator)findAncestorWithClass(this, GovernmentAgencyNationalityITIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

