package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupIsPredecessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupIsPredecessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupIsPredecessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupIsPredecessorOfIterator thespecial_groupIsPredecessorOfIterator = (special_groupIsPredecessorOfIterator)findAncestorWithClass(this, special_groupIsPredecessorOfIterator.class);
			pageContext.getOut().print(thespecial_groupIsPredecessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

