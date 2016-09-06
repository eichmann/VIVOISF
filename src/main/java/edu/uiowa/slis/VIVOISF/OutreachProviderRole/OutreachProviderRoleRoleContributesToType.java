package edu.uiowa.slis.VIVOISF.OutreachProviderRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OutreachProviderRoleRoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OutreachProviderRoleRoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(OutreachProviderRoleRoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OutreachProviderRoleRoleContributesToIterator theOutreachProviderRoleRoleContributesToIterator = (OutreachProviderRoleRoleContributesToIterator)findAncestorWithClass(this, OutreachProviderRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theOutreachProviderRoleRoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OutreachProviderRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing OutreachProviderRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

