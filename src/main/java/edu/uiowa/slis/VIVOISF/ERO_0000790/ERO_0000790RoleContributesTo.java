package edu.uiowa.slis.VIVOISF.ERO_0000790;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000790RoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000790RoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000790RoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000790RoleContributesToIterator theERO_0000790RoleContributesToIterator = (ERO_0000790RoleContributesToIterator)findAncestorWithClass(this, ERO_0000790RoleContributesToIterator.class);
			pageContext.getOut().print(theERO_0000790RoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000790 for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000790 for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

