package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCodeUNDPIterator thegroup = (groupCodeUNDPIterator)findAncestorWithClass(this, groupCodeUNDPIterator.class);
			pageContext.getOut().print(thegroup.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing group for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

