package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupHasTitleIterator thegroupHasTitleIterator = (groupHasTitleIterator)findAncestorWithClass(this, groupHasTitleIterator.class);
			pageContext.getOut().print(thegroupHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

