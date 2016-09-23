package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupSameAsInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupSameAsInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(groupSameAsInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupSameAsInverseIterator thegroupSameAsInverseIterator = (groupSameAsInverseIterator)findAncestorWithClass(this, groupSameAsInverseIterator.class);
			pageContext.getOut().print(thegroupSameAsInverseIterator.getSameAsInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing group for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

