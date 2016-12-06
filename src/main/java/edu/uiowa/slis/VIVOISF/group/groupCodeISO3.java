package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCodeISO3Iterator thegroup = (groupCodeISO3Iterator)findAncestorWithClass(this, groupCodeISO3Iterator.class);
			pageContext.getOut().print(thegroup.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing group for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

