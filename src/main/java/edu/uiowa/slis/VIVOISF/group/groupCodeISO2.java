package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCodeISO2Iterator thegroup = (groupCodeISO2Iterator)findAncestorWithClass(this, groupCodeISO2Iterator.class);
			pageContext.getOut().print(thegroup.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing group for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

