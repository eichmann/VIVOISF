package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationHasMemberType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationHasMemberType currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationHasMemberType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			organizationHasMemberIterator theorganizationHasMemberIterator = (organizationHasMemberIterator)findAncestorWithClass(this, organizationHasMemberIterator.class);
			pageContext.getOut().print(theorganizationHasMemberIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

