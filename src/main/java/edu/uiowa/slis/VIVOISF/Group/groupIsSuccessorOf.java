package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(groupIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupIsSuccessorOfIterator thegroupIsSuccessorOfIterator = (groupIsSuccessorOfIterator)findAncestorWithClass(this, groupIsSuccessorOfIterator.class);
			pageContext.getOut().print(thegroupIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing group for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

