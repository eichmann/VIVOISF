package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationBottomDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationBottomDataPropertyIterator theorganization = (organizationBottomDataPropertyIterator)findAncestorWithClass(this, organizationBottomDataPropertyIterator.class);
			pageContext.getOut().print(theorganization.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

