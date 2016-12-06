package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameOfficialENIterator theGovernmentAgency = (GovernmentAgencyNameOfficialENIterator)findAncestorWithClass(this, GovernmentAgencyNameOfficialENIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

