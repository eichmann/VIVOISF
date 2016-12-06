package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCodeGAULIterator thespecial_group = (special_groupCodeGAULIterator)findAncestorWithClass(this, special_groupCodeGAULIterator.class);
			pageContext.getOut().print(thespecial_group.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

