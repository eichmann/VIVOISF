package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCodeFAOTERMIterator theGovernmentAgency = (GovernmentAgencyCodeFAOTERMIterator)findAncestorWithClass(this, GovernmentAgencyCodeFAOTERMIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

