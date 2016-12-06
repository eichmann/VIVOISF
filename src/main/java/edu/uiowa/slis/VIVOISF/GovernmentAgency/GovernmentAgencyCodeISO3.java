package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCodeISO3Iterator theGovernmentAgency = (GovernmentAgencyCodeISO3Iterator)findAncestorWithClass(this, GovernmentAgencyCodeISO3Iterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

