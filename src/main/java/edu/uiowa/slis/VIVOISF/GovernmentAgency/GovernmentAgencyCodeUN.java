package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCodeUNIterator theGovernmentAgency = (GovernmentAgencyCodeUNIterator)findAncestorWithClass(this, GovernmentAgencyCodeUNIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

