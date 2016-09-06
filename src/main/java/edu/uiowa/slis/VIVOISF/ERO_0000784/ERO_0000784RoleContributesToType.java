package edu.uiowa.slis.VIVOISF.ERO_0000784;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000784RoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000784RoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000784RoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000784RoleContributesToIterator theERO_0000784RoleContributesToIterator = (ERO_0000784RoleContributesToIterator)findAncestorWithClass(this, ERO_0000784RoleContributesToIterator.class);
			pageContext.getOut().print(theERO_0000784RoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000784 for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000784 for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

