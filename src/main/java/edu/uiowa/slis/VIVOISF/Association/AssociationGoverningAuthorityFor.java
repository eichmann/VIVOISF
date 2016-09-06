package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationGoverningAuthorityForIterator theAssociationGoverningAuthorityForIterator = (AssociationGoverningAuthorityForIterator)findAncestorWithClass(this, AssociationGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theAssociationGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

