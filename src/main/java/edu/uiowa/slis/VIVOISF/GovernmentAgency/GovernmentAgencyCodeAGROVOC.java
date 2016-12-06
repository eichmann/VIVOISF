package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCodeAGROVOCIterator theGovernmentAgency = (GovernmentAgencyCodeAGROVOCIterator)findAncestorWithClass(this, GovernmentAgencyCodeAGROVOCIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

