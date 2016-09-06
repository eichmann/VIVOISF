package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCodeFAOSTATIterator thespecial_group = (special_groupCodeFAOSTATIterator)findAncestorWithClass(this, special_groupCodeFAOSTATIterator.class);
			pageContext.getOut().print(thespecial_group.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

