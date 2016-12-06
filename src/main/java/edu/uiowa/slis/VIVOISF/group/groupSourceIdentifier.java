package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(groupSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupSourceIdentifierIterator thegroup = (groupSourceIdentifierIterator)findAncestorWithClass(this, groupSourceIdentifierIterator.class);
			pageContext.getOut().print(thegroup.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing group for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

