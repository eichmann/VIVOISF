package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationRecipientInverseIterator theAssociationRecipientInverseIterator = (AssociationRecipientInverseIterator)findAncestorWithClass(this, AssociationRecipientInverseIterator.class);
			pageContext.getOut().print(theAssociationRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for recipient tag ");
		}
		return SKIP_BODY;
	}
}

