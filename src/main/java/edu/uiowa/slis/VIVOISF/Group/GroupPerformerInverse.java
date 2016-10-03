package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupPerformerInverseIterator theGroupPerformerInverseIterator = (GroupPerformerInverseIterator)findAncestorWithClass(this, GroupPerformerInverseIterator.class);
			pageContext.getOut().print(theGroupPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for performer tag ");
		}
		return SKIP_BODY;
	}
}

