package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationSponsorsIterator theAssociationSponsorsIterator = (AssociationSponsorsIterator)findAncestorWithClass(this, AssociationSponsorsIterator.class);
			pageContext.getOut().print(theAssociationSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

