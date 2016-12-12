package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupCodeFAOSTATIterator theSpecial_group = (Special_groupCodeFAOSTATIterator)findAncestorWithClass(this, Special_groupCodeFAOSTATIterator.class);
			pageContext.getOut().print(theSpecial_group.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

