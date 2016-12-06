package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameOfficialZHIterator theGovernmentAgency = (GovernmentAgencyNameOfficialZHIterator)findAncestorWithClass(this, GovernmentAgencyNameOfficialZHIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

