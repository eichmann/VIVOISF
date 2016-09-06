package edu.uiowa.slis.VIVOISF.PresenterRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresenterRoleRoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresenterRoleRoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(PresenterRoleRoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PresenterRoleRoleContributesToIterator thePresenterRoleRoleContributesToIterator = (PresenterRoleRoleContributesToIterator)findAncestorWithClass(this, PresenterRoleRoleContributesToIterator.class);
			pageContext.getOut().print(thePresenterRoleRoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PresenterRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresenterRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

