package edu.uiowa.slis.VIVOISF.OBI_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000017RoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000017RoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000017RoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000017RoleContributesToIterator theOBI_0000017RoleContributesToIterator = (OBI_0000017RoleContributesToIterator)findAncestorWithClass(this, OBI_0000017RoleContributesToIterator.class);
			pageContext.getOut().print(theOBI_0000017RoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000017 for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000017 for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

