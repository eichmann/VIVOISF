package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AssociationPrefixNameIterator theAssociation = (AssociationPrefixNameIterator)findAncestorWithClass(this, AssociationPrefixNameIterator.class);
			pageContext.getOut().print(theAssociation.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

