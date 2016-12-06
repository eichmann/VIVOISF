package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNationalityENIterator theGovernmentAgency = (GovernmentAgencyNationalityENIterator)findAncestorWithClass(this, GovernmentAgencyNationalityENIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

