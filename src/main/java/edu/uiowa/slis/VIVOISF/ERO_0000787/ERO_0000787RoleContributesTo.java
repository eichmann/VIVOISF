package edu.uiowa.slis.VIVOISF.ERO_0000787;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000787RoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000787RoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000787RoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000787RoleContributesToIterator theERO_0000787RoleContributesToIterator = (ERO_0000787RoleContributesToIterator)findAncestorWithClass(this, ERO_0000787RoleContributesToIterator.class);
			pageContext.getOut().print(theERO_0000787RoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000787 for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000787 for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

