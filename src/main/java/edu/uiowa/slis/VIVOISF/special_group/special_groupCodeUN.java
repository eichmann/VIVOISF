package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCodeUNIterator thespecial_group = (special_groupCodeUNIterator)findAncestorWithClass(this, special_groupCodeUNIterator.class);
			pageContext.getOut().print(thespecial_group.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

