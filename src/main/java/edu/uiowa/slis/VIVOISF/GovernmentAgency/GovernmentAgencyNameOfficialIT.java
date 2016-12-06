package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameOfficialITIterator theGovernmentAgency = (GovernmentAgencyNameOfficialITIterator)findAncestorWithClass(this, GovernmentAgencyNameOfficialITIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

