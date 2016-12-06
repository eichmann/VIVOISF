package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupRelatedByIterator thegroupRelatedByIterator = (groupRelatedByIterator)findAncestorWithClass(this, groupRelatedByIterator.class);
			pageContext.getOut().print(thegroupRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

