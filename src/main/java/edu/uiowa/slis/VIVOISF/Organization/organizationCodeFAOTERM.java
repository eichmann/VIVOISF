package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationCodeFAOTERMIterator theorganization = (organizationCodeFAOTERMIterator)findAncestorWithClass(this, organizationCodeFAOTERMIterator.class);
			pageContext.getOut().print(theorganization.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

