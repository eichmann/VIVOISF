package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupCodeFAOSTATIterator theGroup = (GroupCodeFAOSTATIterator)findAncestorWithClass(this, GroupCodeFAOSTATIterator.class);
			pageContext.getOut().print(theGroup.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

