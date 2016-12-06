package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCodeGAULIterator thegroup = (groupCodeGAULIterator)findAncestorWithClass(this, groupCodeGAULIterator.class);
			pageContext.getOut().print(thegroup.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing group for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

