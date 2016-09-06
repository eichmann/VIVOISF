package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCodeAGROVOCIterator thespecial_group = (special_groupCodeAGROVOCIterator)findAncestorWithClass(this, special_groupCodeAGROVOCIterator.class);
			pageContext.getOut().print(thespecial_group.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

