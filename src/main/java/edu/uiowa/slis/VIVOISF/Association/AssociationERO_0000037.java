package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationERO_0000037Iterator theAssociationERO_0000037Iterator = (AssociationERO_0000037Iterator)findAncestorWithClass(this, AssociationERO_0000037Iterator.class);
			pageContext.getOut().print(theAssociationERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

