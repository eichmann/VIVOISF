package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCodeUNDPIterator theGovernmentAgency = (GovernmentAgencyCodeUNDPIterator)findAncestorWithClass(this, GovernmentAgencyCodeUNDPIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

