package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationOwnerInverseIterator theAssociationOwnerInverseIterator = (AssociationOwnerInverseIterator)findAncestorWithClass(this, AssociationOwnerInverseIterator.class);
			pageContext.getOut().print(theAssociationOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for owner tag ");
		}
		return SKIP_BODY;
	}
}

