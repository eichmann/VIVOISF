package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupEditorInverseIterator theGroupEditorInverseIterator = (GroupEditorInverseIterator)findAncestorWithClass(this, GroupEditorInverseIterator.class);
			pageContext.getOut().print(theGroupEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for editor tag ");
		}
		return SKIP_BODY;
	}
}
