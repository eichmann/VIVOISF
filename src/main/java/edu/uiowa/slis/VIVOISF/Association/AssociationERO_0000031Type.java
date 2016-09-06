package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationERO_0000031Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationERO_0000031Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationERO_0000031Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationERO_0000031Iterator theAssociationERO_0000031Iterator = (AssociationERO_0000031Iterator)findAncestorWithClass(this, AssociationERO_0000031Iterator.class);
			pageContext.getOut().print(theAssociationERO_0000031Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

