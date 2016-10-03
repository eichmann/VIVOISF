package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AssociationSuffixNameIterator theAssociation = (AssociationSuffixNameIterator)findAncestorWithClass(this, AssociationSuffixNameIterator.class);
			pageContext.getOut().print(theAssociation.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

