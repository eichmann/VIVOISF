package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationTopDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationTopDataPropertyIterator theorganization = (organizationTopDataPropertyIterator)findAncestorWithClass(this, organizationTopDataPropertyIterator.class);
			pageContext.getOut().print(theorganization.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

