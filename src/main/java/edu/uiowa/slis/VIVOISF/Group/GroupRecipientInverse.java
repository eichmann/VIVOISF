package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupRecipientInverseIterator theGroupRecipientInverseIterator = (GroupRecipientInverseIterator)findAncestorWithClass(this, GroupRecipientInverseIterator.class);
			pageContext.getOut().print(theGroupRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for recipient tag ");
		}
		return SKIP_BODY;
	}
}

