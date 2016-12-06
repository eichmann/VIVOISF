package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNationalityRUIterator theGovernmentAgency = (GovernmentAgencyNationalityRUIterator)findAncestorWithClass(this, GovernmentAgencyNationalityRUIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

