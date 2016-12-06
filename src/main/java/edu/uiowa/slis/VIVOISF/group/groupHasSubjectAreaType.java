package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupHasSubjectAreaIterator thegroupHasSubjectAreaIterator = (groupHasSubjectAreaIterator)findAncestorWithClass(this, groupHasSubjectAreaIterator.class);
			pageContext.getOut().print(thegroupHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

