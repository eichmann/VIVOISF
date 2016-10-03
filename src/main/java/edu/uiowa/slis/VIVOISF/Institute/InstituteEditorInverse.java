package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteEditorInverseIterator theInstituteEditorInverseIterator = (InstituteEditorInverseIterator)findAncestorWithClass(this, InstituteEditorInverseIterator.class);
			pageContext.getOut().print(theInstituteEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for editor tag ");
		}
		return SKIP_BODY;
	}
}

