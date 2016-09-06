package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationERO_0001520Iterator theAssociationERO_0001520Iterator = (AssociationERO_0001520Iterator)findAncestorWithClass(this, AssociationERO_0001520Iterator.class);
			pageContext.getOut().print(theAssociationERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

