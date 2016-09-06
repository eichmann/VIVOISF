package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023RoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023RoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023RoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023RoleContributesToIterator theBFO_0000023RoleContributesToIterator = (BFO_0000023RoleContributesToIterator)findAncestorWithClass(this, BFO_0000023RoleContributesToIterator.class);
			pageContext.getOut().print(theBFO_0000023RoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

