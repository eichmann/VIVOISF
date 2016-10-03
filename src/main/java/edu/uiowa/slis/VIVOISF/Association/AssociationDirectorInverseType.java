package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationDirectorInverseIterator theAssociationDirectorInverseIterator = (AssociationDirectorInverseIterator)findAncestorWithClass(this, AssociationDirectorInverseIterator.class);
			pageContext.getOut().print(theAssociationDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for director tag ");
		}
		return SKIP_BODY;
	}
}

