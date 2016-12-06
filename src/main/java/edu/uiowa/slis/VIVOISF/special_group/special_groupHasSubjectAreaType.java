package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupHasSubjectAreaIterator thespecial_groupHasSubjectAreaIterator = (special_groupHasSubjectAreaIterator)findAncestorWithClass(this, special_groupHasSubjectAreaIterator.class);
			pageContext.getOut().print(thespecial_groupHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

