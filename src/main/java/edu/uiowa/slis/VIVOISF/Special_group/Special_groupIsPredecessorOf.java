package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupIsPredecessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupIsPredecessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupIsPredecessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Special_groupIsPredecessorOfIterator theSpecial_groupIsPredecessorOfIterator = (Special_groupIsPredecessorOfIterator)findAncestorWithClass(this, Special_groupIsPredecessorOfIterator.class);
			pageContext.getOut().print(theSpecial_groupIsPredecessorOfIterator.getIsPredecessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

