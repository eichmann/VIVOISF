package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineEditorIterator theClinicalGuidelineEditorIterator = (ClinicalGuidelineEditorIterator)findAncestorWithClass(this, ClinicalGuidelineEditorIterator.class);
			pageContext.getOut().print(theClinicalGuidelineEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for editor tag ");
		}
		return SKIP_BODY;
	}
}

