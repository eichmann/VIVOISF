package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupIsSuccessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupIsSuccessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupIsSuccessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Special_groupIsSuccessorOfIterator theSpecial_groupIsSuccessorOfIterator = (Special_groupIsSuccessorOfIterator)findAncestorWithClass(this, Special_groupIsSuccessorOfIterator.class);
			pageContext.getOut().print(theSpecial_groupIsSuccessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

