package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationCourtInverseIterator theAssociationCourtInverseIterator = (AssociationCourtInverseIterator)findAncestorWithClass(this, AssociationCourtInverseIterator.class);
			pageContext.getOut().print(theAssociationCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for court tag ");
		}
		return SKIP_BODY;
	}
}

