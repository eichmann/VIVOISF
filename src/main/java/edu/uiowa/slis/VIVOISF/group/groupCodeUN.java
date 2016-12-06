package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCodeUNIterator thegroup = (groupCodeUNIterator)findAncestorWithClass(this, groupCodeUNIterator.class);
			pageContext.getOut().print(thegroup.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing group for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

