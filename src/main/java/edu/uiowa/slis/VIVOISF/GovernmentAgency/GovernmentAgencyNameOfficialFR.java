package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameOfficialFRIterator theGovernmentAgency = (GovernmentAgencyNameOfficialFRIterator)findAncestorWithClass(this, GovernmentAgencyNameOfficialFRIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

