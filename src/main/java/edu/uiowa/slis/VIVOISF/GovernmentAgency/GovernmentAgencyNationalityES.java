package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNationalityESIterator theGovernmentAgency = (GovernmentAgencyNationalityESIterator)findAncestorWithClass(this, GovernmentAgencyNationalityESIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}
