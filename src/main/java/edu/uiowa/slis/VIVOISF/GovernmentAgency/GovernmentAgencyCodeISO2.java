package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCodeISO2Iterator theGovernmentAgency = (GovernmentAgencyCodeISO2Iterator)findAncestorWithClass(this, GovernmentAgencyCodeISO2Iterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

