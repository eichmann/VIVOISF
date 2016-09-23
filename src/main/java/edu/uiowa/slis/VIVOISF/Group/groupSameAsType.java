package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupSameAsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupSameAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupSameAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupSameAsIterator thegroupSameAsIterator = (groupSameAsIterator)findAncestorWithClass(this, groupSameAsIterator.class);
			pageContext.getOut().print(thegroupSameAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

