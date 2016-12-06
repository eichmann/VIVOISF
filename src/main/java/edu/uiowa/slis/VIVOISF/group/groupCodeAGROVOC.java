package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCodeAGROVOCIterator thegroup = (groupCodeAGROVOCIterator)findAncestorWithClass(this, groupCodeAGROVOCIterator.class);
			pageContext.getOut().print(thegroup.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing group for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

