package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupCodeAGROVOCIterator theSpecial_group = (Special_groupCodeAGROVOCIterator)findAncestorWithClass(this, Special_groupCodeAGROVOCIterator.class);
			pageContext.getOut().print(theSpecial_group.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

