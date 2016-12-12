package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupCodeUNIterator theGroup = (GroupCodeUNIterator)findAncestorWithClass(this, GroupCodeUNIterator.class);
			pageContext.getOut().print(theGroup.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

