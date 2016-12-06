package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameOfficialRUIterator theGovernmentAgency = (GovernmentAgencyNameOfficialRUIterator)findAncestorWithClass(this, GovernmentAgencyNameOfficialRUIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

