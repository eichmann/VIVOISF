package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(groupSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupSameAsIterator thegroup = (groupSameAsIterator)findAncestorWithClass(this, groupSameAsIterator.class);
			pageContext.getOut().print(thegroup.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing group for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

