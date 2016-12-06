package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCodeUNDPIterator thespecial_group = (special_groupCodeUNDPIterator)findAncestorWithClass(this, special_groupCodeUNDPIterator.class);
			pageContext.getOut().print(thespecial_group.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

