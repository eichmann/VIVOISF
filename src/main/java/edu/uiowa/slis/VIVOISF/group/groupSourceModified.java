package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupSourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupSourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(groupSourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupSourceModifiedIterator thegroup = (groupSourceModifiedIterator)findAncestorWithClass(this, groupSourceModifiedIterator.class);
			pageContext.getOut().print(thegroup.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing group for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

