package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationCodeAGROVOCIterator theorganization = (organizationCodeAGROVOCIterator)findAncestorWithClass(this, organizationCodeAGROVOCIterator.class);
			pageContext.getOut().print(theorganization.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

