package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationPerformerInverseIterator theAssociationPerformerInverseIterator = (AssociationPerformerInverseIterator)findAncestorWithClass(this, AssociationPerformerInverseIterator.class);
			pageContext.getOut().print(theAssociationPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for performer tag ");
		}
		return SKIP_BODY;
	}
}

