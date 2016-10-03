package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeEditorInverseIterator theCollegeEditorInverseIterator = (CollegeEditorInverseIterator)findAncestorWithClass(this, CollegeEditorInverseIterator.class);
			pageContext.getOut().print(theCollegeEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing College for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for editor tag ");
		}
		return SKIP_BODY;
	}
}

