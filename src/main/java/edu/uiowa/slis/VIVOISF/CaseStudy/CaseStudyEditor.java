package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyEditorIterator theCaseStudyEditorIterator = (CaseStudyEditorIterator)findAncestorWithClass(this, CaseStudyEditorIterator.class);
			pageContext.getOut().print(theCaseStudyEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for editor tag ");
		}
		return SKIP_BODY;
	}
}

