package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNationalityARIterator theGovernmentAgency = (GovernmentAgencyNationalityARIterator)findAncestorWithClass(this, GovernmentAgencyNationalityARIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

