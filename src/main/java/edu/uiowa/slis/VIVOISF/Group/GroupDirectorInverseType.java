package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupDirectorInverseIterator theGroupDirectorInverseIterator = (GroupDirectorInverseIterator)findAncestorWithClass(this, GroupDirectorInverseIterator.class);
			pageContext.getOut().print(theGroupDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for director tag ");
		}
		return SKIP_BODY;
	}
}
