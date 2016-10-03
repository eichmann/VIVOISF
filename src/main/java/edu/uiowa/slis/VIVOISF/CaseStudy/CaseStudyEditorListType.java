package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyEditorListIterator theCaseStudyEditorListIterator = (CaseStudyEditorListIterator)findAncestorWithClass(this, CaseStudyEditorListIterator.class);
			pageContext.getOut().print(theCaseStudyEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for editorList tag ");
		}
		return SKIP_BODY;
	}
}

