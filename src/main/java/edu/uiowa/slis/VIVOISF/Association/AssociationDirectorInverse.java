package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationDirectorInverseIterator theAssociationDirectorInverseIterator = (AssociationDirectorInverseIterator)findAncestorWithClass(this, AssociationDirectorInverseIterator.class);
			pageContext.getOut().print(theAssociationDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for director tag ");
		}
		return SKIP_BODY;
	}
}

