package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCodeISO2Iterator thespecial_group = (special_groupCodeISO2Iterator)findAncestorWithClass(this, special_groupCodeISO2Iterator.class);
			pageContext.getOut().print(thespecial_group.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

