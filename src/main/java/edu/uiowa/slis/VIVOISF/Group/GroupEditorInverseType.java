package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupEditorInverseIterator theGroupEditorInverseIterator = (GroupEditorInverseIterator)findAncestorWithClass(this, GroupEditorInverseIterator.class);
			pageContext.getOut().print(theGroupEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for editor tag ");
		}
		return SKIP_BODY;
	}
}

