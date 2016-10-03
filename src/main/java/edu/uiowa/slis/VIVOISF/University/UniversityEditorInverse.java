package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityEditorInverseIterator theUniversityEditorInverseIterator = (UniversityEditorInverseIterator)findAncestorWithClass(this, UniversityEditorInverseIterator.class);
			pageContext.getOut().print(theUniversityEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing University for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for editor tag ");
		}
		return SKIP_BODY;
	}
}

