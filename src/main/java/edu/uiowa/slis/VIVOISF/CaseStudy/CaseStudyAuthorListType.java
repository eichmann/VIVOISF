package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyAuthorListIterator theCaseStudyAuthorListIterator = (CaseStudyAuthorListIterator)findAncestorWithClass(this, CaseStudyAuthorListIterator.class);
			pageContext.getOut().print(theCaseStudyAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for authorList tag ");
		}
		return SKIP_BODY;
	}
}

