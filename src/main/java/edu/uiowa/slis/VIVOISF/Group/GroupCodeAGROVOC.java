package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupCodeAGROVOCIterator theGroup = (GroupCodeAGROVOCIterator)findAncestorWithClass(this, GroupCodeAGROVOCIterator.class);
			pageContext.getOut().print(theGroup.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

