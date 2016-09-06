package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupIsSuccessorOfIterator thespecial_groupIsSuccessorOfIterator = (special_groupIsSuccessorOfIterator)findAncestorWithClass(this, special_groupIsSuccessorOfIterator.class);
			pageContext.getOut().print(thespecial_groupIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

