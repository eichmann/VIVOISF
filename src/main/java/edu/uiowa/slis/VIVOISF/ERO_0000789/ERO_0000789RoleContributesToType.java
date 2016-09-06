package edu.uiowa.slis.VIVOISF.ERO_0000789;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000789RoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000789RoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000789RoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000789RoleContributesToIterator theERO_0000789RoleContributesToIterator = (ERO_0000789RoleContributesToIterator)findAncestorWithClass(this, ERO_0000789RoleContributesToIterator.class);
			pageContext.getOut().print(theERO_0000789RoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000789 for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000789 for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

