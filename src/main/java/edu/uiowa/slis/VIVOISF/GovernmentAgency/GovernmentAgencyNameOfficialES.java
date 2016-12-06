package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameOfficialESIterator theGovernmentAgency = (GovernmentAgencyNameOfficialESIterator)findAncestorWithClass(this, GovernmentAgencyNameOfficialESIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

