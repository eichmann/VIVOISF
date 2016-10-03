package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineEditorListIterator theClinicalGuidelineEditorListIterator = (ClinicalGuidelineEditorListIterator)findAncestorWithClass(this, ClinicalGuidelineEditorListIterator.class);
			pageContext.getOut().print(theClinicalGuidelineEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for editorList tag ");
		}
		return SKIP_BODY;
	}
}

