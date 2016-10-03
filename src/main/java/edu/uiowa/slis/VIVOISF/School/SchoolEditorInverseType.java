package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolEditorInverseIterator theSchoolEditorInverseIterator = (SchoolEditorInverseIterator)findAncestorWithClass(this, SchoolEditorInverseIterator.class);
			pageContext.getOut().print(theSchoolEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for editor tag ");
		}
		return SKIP_BODY;
	}
}

