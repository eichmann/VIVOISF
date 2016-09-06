package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationRelatedByIterator theAssociationRelatedByIterator = (AssociationRelatedByIterator)findAncestorWithClass(this, AssociationRelatedByIterator.class);
			pageContext.getOut().print(theAssociationRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

