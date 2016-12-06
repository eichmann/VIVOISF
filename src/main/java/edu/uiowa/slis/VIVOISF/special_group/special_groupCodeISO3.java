package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCodeISO3Iterator thespecial_group = (special_groupCodeISO3Iterator)findAncestorWithClass(this, special_groupCodeISO3Iterator.class);
			pageContext.getOut().print(thespecial_group.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

