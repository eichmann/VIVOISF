package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupDoiIterator theGroup = (GroupDoiIterator)findAncestorWithClass(this, GroupDoiIterator.class);
			pageContext.getOut().print(theGroup.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for doi tag ");
		}
		return SKIP_BODY;
	}
}

