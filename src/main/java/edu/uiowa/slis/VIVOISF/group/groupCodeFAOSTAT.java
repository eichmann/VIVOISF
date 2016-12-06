package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCodeFAOSTATIterator thegroup = (groupCodeFAOSTATIterator)findAncestorWithClass(this, groupCodeFAOSTATIterator.class);
			pageContext.getOut().print(thegroup.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing group for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

